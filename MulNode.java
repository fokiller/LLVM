public class MulNode extends ASTNode {
    private ASTNode left, right;

    public MulNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        String leftVal = left.generateLLVM(builder);
        String rightVal = right.generateLLVM(builder);
        String temp = builder.createTemp();
        builder.emit(temp + " = mul i32 " + leftVal + ", " + rightVal);
        return temp;
    }
}
