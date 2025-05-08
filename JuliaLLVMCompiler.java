import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JuliaLLVMCompiler extends JuliaSubsetBaseVisitor<String> {

    private StringBuilder llvmCode = new StringBuilder();
    private int tempVarCounter = 0;
    private int labelCounter = 0;
    private Map<String, String> variablePointers = new HashMap<>();

    public JuliaLLVMCompiler() {
        startModule();
    }

    private void startModule() {
        llvmCode.append("; ModuleID = 'JuliaSubsetCompiler'\n");
        llvmCode.append("declare i32 @printf(i8*, ...)\n");
        llvmCode.append("@print.str = constant [4 x i8] c\"%d\\0A\\00\"\n\n");
        llvmCode.append("define i32 @main() {\n");
    }

    private void endModule() {
        llvmCode.append("  ret i32 0\n");
        llvmCode.append("}\n");
    }

    private String newTemp() {
        return "%t" + (tempVarCounter++);
    }

    private String newLabel() {
        return "label" + (labelCounter++);
    }

    public void saveToFile(String filename) throws IOException {
        endModule();
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(llvmCode.toString());
        }
    }

    @Override
    public String visitProgram(JuliaSubsetParser.ProgramContext ctx) {
        for (JuliaSubsetParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return null;
    }

    @Override
    public String visitAssignmentStmt(JuliaSubsetParser.AssignmentStmtContext ctx) {
        String varName = ctx.ID() != null ? ctx.ID().getText() : ctx.getChild(2).getText();
        String value = visit(ctx.expr());

        if (!variablePointers.containsKey(varName)) {
            String ptr = newTemp();
            llvmCode.append("  ").append(ptr).append(" = alloca i32\n");
            variablePointers.put(varName, ptr);
        }

        llvmCode.append("  store i32 ").append(value).append(", i32* ").append(variablePointers.get(varName))
                .append("\n");

        return null;
    }

    @Override
    public String visitPrintStmt(JuliaSubsetParser.PrintStmtContext ctx) {
        String value = visit(ctx.expr());

        // If value is an integer literal, we directly print it.
        String temp = newTemp();
        llvmCode.append("  ").append(temp).append(" = add i32 0, ").append(value).append("\n");

        llvmCode.append(
                "  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @print.str, i32 0, i32 0), i32 ")
                .append(temp).append(")\n");

        return null;
    }

    @Override
    public String visitAddSubExpr(JuliaSubsetParser.AddSubExprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String temp = newTemp();
        String op = ctx.op.getText().equals("+") ? "add" : "sub";

        llvmCode.append("  ").append(temp).append(" = ").append(op).append(" i32 ").append(left).append(", ")
                .append(right).append("\n");

        return temp;
    }

    @Override
    public String visitMulDivExpr(JuliaSubsetParser.MulDivExprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String temp = newTemp();
        String op = ctx.op.getText().equals("*") ? "mul" : "sdiv";

        llvmCode.append("  ").append(temp).append(" = ").append(op).append(" i32 ").append(left).append(", ")
                .append(right).append("\n");

        return temp;
    }

    @Override
    public String visitIntExpr(JuliaSubsetParser.IntExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIdExpr(JuliaSubsetParser.IdExprContext ctx) {
        String varName = ctx.getText();
        if (!variablePointers.containsKey(varName)) {
            String ptr = newTemp();
            llvmCode.append("  ").append(ptr).append(" = alloca i32\n");
            llvmCode.append("  store i32 0, i32* ").append(ptr).append("\n"); // Default initialize to 0
            variablePointers.put(varName, ptr);
        }
        String temp = newTemp();
        llvmCode.append("  ").append(temp).append(" = load i32, i32* ").append(variablePointers.get(varName))
                .append("\n");
        return temp;
    }

}
