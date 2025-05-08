public class VarNode extends ASTNode {
    private String name;

    public VarNode(String name) {
        this.name = name;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        return builder.getVariable(name);
    }
}
