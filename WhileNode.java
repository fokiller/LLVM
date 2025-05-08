public class WhileNode extends ASTNode {
    private ASTNode condition;
    private BlockNode body;

    public WhileNode(ASTNode condition, BlockNode body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        String condLabel = builder.createLabel("while_cond");
        String bodyLabel = builder.createLabel("while_body");
        String endLabel = builder.createLabel("while_end");

        builder.emit("br label %" + condLabel);
        builder.emit(condLabel + ":");

        String condVal = condition.generateLLVM(builder);
        builder.emit("br i1 " + condVal + ", label %" + bodyLabel + ", label %" + endLabel);

        builder.emit(bodyLabel + ":");
        builder.emit(body.generateLLVM(builder));
        builder.emit("br label %" + condLabel);

        builder.emit(endLabel + ":");

        return "";
    }
}
