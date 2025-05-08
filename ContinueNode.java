public class ContinueNode extends ASTNode {
    @Override
    public String generateLLVM(IRBuilder builder) {
        return "; continue (not implemented)";
    }
}
