import java.util.List;

public class ProgramNode extends ASTNode {
    private List<ASTNode> statements;

    public ProgramNode(List<ASTNode> statements) {
        this.statements = statements;
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        StringBuilder sb = new StringBuilder();

        // Emit all function declarations first
        for (ASTNode stmt : statements) {
            if (stmt instanceof FuncDeclNode) {
                sb.append(stmt.generateLLVM(builder)).append("\n");
            }
        }

        // Then emit main block for the rest
        builder.emit("define i32 @main() {");
        for (ASTNode stmt : statements) {
            if (!(stmt instanceof FuncDeclNode)) {
                builder.emit(stmt.generateLLVM(builder));
            }
        }
        builder.emit("ret i32 0");
        builder.emit("}");

        return builder.getIR();
    }
}
