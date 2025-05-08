public class BinaryOpNode extends ASTNode {
    private ASTNode left, right;
    private String op;

    public BinaryOpNode(ASTNode left, String op, ASTNode right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        String leftVal = left.generateLLVM(builder);
        String rightVal = right.generateLLVM(builder);
        String temp = builder.createTemp();

        switch (op) {
            case "+" -> builder.emit(temp + " = add i32 " + leftVal + ", " + rightVal);
            case "-" -> builder.emit(temp + " = sub i32 " + leftVal + ", " + rightVal);
            case "*" -> builder.emit(temp + " = mul i32 " + leftVal + ", " + rightVal);
            case "/" -> builder.emit(temp + " = sdiv i32 " + leftVal + ", " + rightVal);
            case "==" -> builder.emit(temp + " = icmp eq i32 " + leftVal + ", " + rightVal);
            case "!=" -> builder.emit(temp + " = icmp ne i32 " + leftVal + ", " + rightVal);
            case "<" -> builder.emit(temp + " = icmp slt i32 " + leftVal + ", " + rightVal);
            case "<=" -> builder.emit(temp + " = icmp sle i32 " + leftVal + ", " + rightVal);
            case ">" -> builder.emit(temp + " = icmp sgt i32 " + leftVal + ", " + rightVal);
            case ">=" -> builder.emit(temp + " = icmp sge i32 " + leftVal + ", " + rightVal);
            default -> throw new RuntimeException("Unsupported operator: " + op);
        }

        return temp;
    }
}
