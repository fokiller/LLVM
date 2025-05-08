public class IfNode extends ASTNode {
    private ASTNode condition;
    private BlockNode thenBlock;

    public IfNode(ASTNode condition, BlockNode thenBlock) {
        this.condition = condition;
        this.thenBlock = thenBlock;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        String condVal = condition.generateLLVM(builder);
        String labelTrue = builder.createLabel("then");
        String labelEnd = builder.createLabel("end");

        builder.emit("br i1 " + condVal + ", label %" + labelTrue + ", label %" + labelEnd);
        builder.emit(labelTrue + ":");
        builder.emit(thenBlock.generateLLVM(builder));
        builder.emit("br label %" + labelEnd);
        builder.emit(labelEnd + ":");

        return "";
    }
}
