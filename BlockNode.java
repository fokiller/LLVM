import java.util.ArrayList;
import java.util.List;

public class BlockNode extends ASTNode {
    private List<ASTNode> statements;

    public BlockNode() {
        this.statements = new ArrayList<>();
    }

    public BlockNode(List<ASTNode> statements) {
        this.statements = statements;
    }

    public void addStatement(ASTNode stmt) {
        statements.add(stmt);
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        StringBuilder sb = new StringBuilder();
        for (ASTNode stmt : statements) {
            sb.append(stmt.generateLLVM(builder));
        }
        return sb.toString();
    }
}
