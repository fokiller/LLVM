import java.util.List;

public class FuncDeclNode extends ASTNode {
    private String name;
    private List<String> params;
    private BlockNode body;

    public FuncDeclNode(String name, List<String> params, BlockNode body) {
        this.name = name;
        this.params = params;
        this.body = body;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        StringBuilder paramStr = new StringBuilder();
        for (int i = 0; i < params.size(); i++) {
            if (i > 0)
                paramStr.append(", ");
            paramStr.append("i32 %").append(params.get(i));
        }

        builder.emit("define i32 @" + name + "(" + paramStr + ") {");

        // Generate all statements
        builder.emit(body.generateLLVM(builder));

        // Check if last statement is a ReturnNode
        List<ASTNode> stmts = body.getStatements();
        if (!stmts.isEmpty()) {
            ASTNode last = stmts.get(stmts.size() - 1);
            if (!(last instanceof ReturnNode)) {
                builder.emit("ret i32 0");
            }
        } else {
            builder.emit("ret i32 0");
        }

        builder.emit("}");
        return "";
    }
}
