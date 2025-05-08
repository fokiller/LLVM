public class BreakNode extends ASTNode {
    @Override
    public String generateLLVM(IRBuilder builder) {
        // TODO: Proper handling of break jumps can be implemented later
        return "; break statement (currently not generating a branch)";
    }
}
