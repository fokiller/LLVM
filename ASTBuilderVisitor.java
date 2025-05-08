import java.util.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ASTBuilderVisitor extends JuliaSubsetBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(JuliaSubsetParser.ProgramContext ctx) {
        List<ASTNode> statements = new ArrayList<>();
        for (JuliaSubsetParser.StatementContext stmtCtx : ctx.statement()) {
            ASTNode stmt = visit(stmtCtx);
            if (stmt != null) {
                statements.add(stmt);
            }
        }
        return new ProgramNode(statements);
    }

    @Override
    public ASTNode visitBlock(JuliaSubsetParser.BlockContext ctx) {
        List<ASTNode> statements = new ArrayList<>();
        for (JuliaSubsetParser.StatementContext stmtCtx : ctx.statement()) {
            statements.add(visit(stmtCtx));
        }
        if (ctx.returnStmt() != null) {
            statements.add(visit(ctx.returnStmt()));
        }
        return new BlockNode(statements);
    }

    @Override
    public ASTNode visitReturnStmt(JuliaSubsetParser.ReturnStmtContext ctx) {
        return new ReturnNode(visit(ctx.expr()));
    }

    @Override
    public ASTNode visitAssignmentStmt(JuliaSubsetParser.AssignmentStmtContext ctx) {
        String varName = ctx.ID() != null ? ctx.ID().getText() : ctx.getChild(2).getText();
        ASTNode expr = visit(ctx.expr());
        return new AssignmentNode(varName, expr);
    }

    @Override
    public ASTNode visitPrintStmt(JuliaSubsetParser.PrintStmtContext ctx) {
        ASTNode expr = visit(ctx.expr());
        return new PrintNode(expr);
    }

    @Override
    public ASTNode visitFuncDecl(JuliaSubsetParser.FuncDeclContext ctx) {
        String name = ctx.ID().getText();
        List<String> params = new ArrayList<>();
        if (ctx.paramList() != null) {
            for (TerminalNode id : ctx.paramList().ID()) {
                params.add(id.getText());
            }
        }
        BlockNode body = (BlockNode) visit(ctx.block());
        return new FuncDeclNode(name, params, body);
    }

    @Override
    public ASTNode visitFuncCallStmt(JuliaSubsetParser.FuncCallStmtContext ctx) {
        return new FunctionCallNode(ctx.ID().getText(), getExprList(ctx.argList()));
    }

    @Override
    public ASTNode visitFuncCallExpr(JuliaSubsetParser.FuncCallExprContext ctx) {
        return new FunctionCallNode(ctx.ID().getText(), getExprList(ctx.argList()));
    }

    private List<ASTNode> getExprList(JuliaSubsetParser.ArgListContext ctx) {
        List<ASTNode> args = new ArrayList<>();
        if (ctx != null) {
            for (JuliaSubsetParser.ExprContext expr : ctx.expr()) {
                args.add(visit(expr));
            }
        }
        return args;
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
    public ASTNode visitParensExpr(JuliaSubsetParser.ParensExprContext ctx) {
        return visit(ctx.expr());
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
    public ASTNode visitBreakStmt(JuliaSubsetParser.BreakStmtContext ctx) {
        return new BreakNode();
    }

    @Override
    public ASTNode visitContinueStmt(JuliaSubsetParser.ContinueStmtContext ctx) {
        return new ContinueNode();
    }

    @Override
    public ASTNode visitIfStmt(JuliaSubsetParser.IfStmtContext ctx) {
        ASTNode condition = visit(ctx.expr());
        BlockNode thenBlock = (BlockNode) visit(ctx.block());
        return new IfNode(condition, thenBlock);
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
}
