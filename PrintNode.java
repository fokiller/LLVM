public class PrintNode extends ASTNode {
    private ASTNode expr;

    public PrintNode(ASTNode expr) {
        this.expr = expr;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        String value = expr.generateLLVM(builder);
        String temp = builder.createTemp();
        builder.emit(temp + " = add i32 0, " + value); // force to register
        builder.emit(
                "call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @print.str, i32 0, i32 0), i32 "
                        + temp + ")");
        return "";
    }
}
