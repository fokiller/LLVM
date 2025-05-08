public class IntNode extends ASTNode {
    private int value;

    public IntNode(int value) {
        this.value = value;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        String temp = builder.createTemp();
        builder.emit(temp + " = add i32 0, " + value);
        return temp;
    }
}
