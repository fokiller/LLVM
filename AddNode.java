public class AddNode extends ASTNode {
    private ASTNode left, right;

    public AddNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        String leftVal = left.generateLLVM(builder);
        String rightVal = right.generateLLVM(builder);
        String temp = builder.createTemp();
        builder.emit(temp + " = add i32 " + leftVal + ", " + rightVal);
        return temp;
    }
}
