import java.io.FileWriter;
import java.io.IOException;

public class LLVMCodeGenerator {
    private IRBuilder builder;

    public String generate(ASTNode ast) {
        builder = new IRBuilder();

        builder.emit("; ModuleID = 'mymodule'");
        builder.emit("declare i32 @printf(i8*, ...)");
        builder.emit("@print.str = constant [4 x i8] c\"%d\\0A\\00\"");
        builder.emit("");

        // Emit top-level function declarations first (if any)
        if (ast instanceof ProgramNode progNode) {
            for (ASTNode node : progNode.getStatements()) {
                if (node instanceof FuncDeclNode func) {
                    builder.emit(func.generateLLVM(builder));
                }
            }

            // Emit main block (non-function nodes)
            builder.emit("define i32 @main() {");
            for (ASTNode node : progNode.getStatements()) {
                if (!(node instanceof FuncDeclNode)) {
                    builder.emit(node.generateLLVM(builder));
                }
            }
            builder.emit("ret i32 0");
            builder.emit("}");
        } else {
            // Fallback if ast isn't a ProgramNode
            builder.emit("define i32 @main() {");
            builder.emit(ast.generateLLVM(builder));
            builder.emit("ret i32 0");
            builder.emit("}");
        }

        return builder.getIR();
    }

    public void saveToFile(String filename, ASTNode ast) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(generate(ast));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
