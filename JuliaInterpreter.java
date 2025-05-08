import java.util.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JuliaInterpreter extends JuliaSubsetBaseVisitor<ASTNode> {

    Map<String, FuncDeclNode> functions = new HashMap<>();
    Deque<Map<String, ASTNode>> scopes = new ArrayDeque<>();

    public JuliaInterpreter() {
        scopes.push(new HashMap<>());
    }

    @Override
    public ASTNode visitProgram(JuliaSubsetParser.ProgramContext ctx) {
        BlockNode programBlock = new BlockNode(new ArrayList<>());
        for (var stmt : ctx.statement()) {
            programBlock.addStatement(visit(stmt));
        }
        return programBlock;
    }

    @Override
    public ASTNode visitBlock(JuliaSubsetParser.BlockContext ctx) {
        BlockNode block = new BlockNode(new ArrayList<>());
        for (var stmt : ctx.statement()) {
            block.addStatement(visit(stmt));
        }
        return block;
    }

    @Override
    public ASTNode visitAssignmentStmt(JuliaSubsetParser.AssignmentStmtContext ctx) {
        String varName = ctx.ID() != null ? ctx.ID().getText() : ctx.getChild(2).getText();
        ASTNode exprNode = visit(ctx.expr());
        return new AssignmentNode(varName, exprNode);
    }

    @Override
    public ASTNode visitPrintStmt(JuliaSubsetParser.PrintStmtContext ctx) {
        return new PrintNode(visit(ctx.expr()));
    }

    @Override
    public ASTNode visitFuncDecl(JuliaSubsetParser.FuncDeclContext ctx) {
        String funcName = ctx.ID().getText();
        List<String> params = new ArrayList<>();
        if (ctx.paramList() != null) {
            for (var id : ctx.paramList().ID()) {
                params.add(id.getText());
            }
        }
        BlockNode body = (BlockNode) visit(ctx.block());
        FuncDeclNode funcNode = new FuncDeclNode(funcName, params, body);
        functions.put(funcName, funcNode);
        return funcNode;
    }

    @Override
    public ASTNode visitFuncCallStmt(JuliaSubsetParser.FuncCallStmtContext ctx) {
        return visitFuncCall(ctx.ID().getText(), ctx.argList());
    }

    @Override
    public ASTNode visitFuncCallExpr(JuliaSubsetParser.FuncCallExprContext ctx) {
        return visitFuncCall(ctx.ID().getText(), ctx.argList());
    }

    private ASTNode visitFuncCall(String name, JuliaSubsetParser.ArgListContext args) {
        List<ASTNode> arguments = new ArrayList<>();
        if (args != null) {
            for (var expr : args.expr()) {
                arguments.add(visit(expr));
            }
        }
        return new FunctionCallNode(name, arguments);
    }

    @Override
    public ASTNode visitAddSubExpr(JuliaSubsetParser.AddSubExprContext ctx) {
        ASTNode left = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        return new BinaryOpNode(left, op, right);
    }

    @Override
    public ASTNode visitMulDivExpr(JuliaSubsetParser.MulDivExprContext ctx) {
        ASTNode left = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        return new BinaryOpNode(left, op, right);
    }

    @Override
    public ASTNode visitComparisonExpr(JuliaSubsetParser.ComparisonExprContext ctx) {
        ASTNode left = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        return new BinaryOpNode(left, op, right);
    }

    @Override
    public ASTNode visitWhileStmt(JuliaSubsetParser.WhileStmtContext ctx) {
        ASTNode condition = visit(ctx.expr());
        BlockNode body = (BlockNode) visit(ctx.block());
        return new WhileNode(condition, body);
    }

    @Override
    public ASTNode visitForStmt(JuliaSubsetParser.ForStmtContext ctx) {
        String varName = ctx.ID().getText();
        ASTNode start = visit(ctx.expr(0));
        ASTNode end = visit(ctx.expr(1));
        BlockNode body = (BlockNode) visit(ctx.block());
        return new ForNode(varName, start, end, body);
    }

    @Override
    public ASTNode visitIfStmt(JuliaSubsetParser.IfStmtContext ctx) {
        ASTNode condition = visit(ctx.expr());
        BlockNode trueBranch = (BlockNode) visit(ctx.block());
        return new IfNode(condition, trueBranch);
    }

    @Override
    public ASTNode visitIdExpr(JuliaSubsetParser.IdExprContext ctx) {
        return new VarNode(ctx.getText());
    }

    @Override
    public ASTNode visitIntExpr(JuliaSubsetParser.IntExprContext ctx) {
        return new IntNode(Integer.parseInt(ctx.getText()));
    }

    @Override
    public ASTNode visitStringExpr(JuliaSubsetParser.StringExprContext ctx) {
        return new StringNode(ctx.getText().substring(1, ctx.getText().length() - 1));
    }

    @Override
    public ASTNode visitParensExpr(JuliaSubsetParser.ParensExprContext ctx) {
        return visit(ctx.expr());
    }
}
