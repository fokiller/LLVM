public class StringNode extends ASTNode {
    private String value;

    public StringNode(String value) {
        this.value = value;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        // Strings are not handled in our LLVM (for now)
        return "";
    }
}
