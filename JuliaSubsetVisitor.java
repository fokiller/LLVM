// Generated from JuliaSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JuliaSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JuliaSubsetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JuliaSubsetParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#interfaceDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDecl(JuliaSubsetParser.InterfaceDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JuliaSubsetParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#methodSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSignature(JuliaSubsetParser.MethodSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(JuliaSubsetParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JuliaSubsetParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(JuliaSubsetParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#constructorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDecl(JuliaSubsetParser.ConstructorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#destructorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructorDecl(JuliaSubsetParser.DestructorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(JuliaSubsetParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(JuliaSubsetParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#objectDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDecl(JuliaSubsetParser.ObjectDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JuliaSubsetParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(JuliaSubsetParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#inputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmt(JuliaSubsetParser.InputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(JuliaSubsetParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#deleteStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStmt(JuliaSubsetParser.DeleteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(JuliaSubsetParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(JuliaSubsetParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(JuliaSubsetParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(JuliaSubsetParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(JuliaSubsetParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(JuliaSubsetParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JuliaSubsetParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(JuliaSubsetParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(JuliaSubsetParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#funcCallStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallStmt(JuliaSubsetParser.FuncCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JuliaSubsetParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(JuliaSubsetParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(JuliaSubsetParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(JuliaSubsetParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(JuliaSubsetParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisFieldExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisFieldExpr(JuliaSubsetParser.ThisFieldExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(JuliaSubsetParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAccessExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccessExpr(JuliaSubsetParser.FieldAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(JuliaSubsetParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(JuliaSubsetParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(JuliaSubsetParser.FuncCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpr(JuliaSubsetParser.MethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuliaSubsetParser#visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility(JuliaSubsetParser.VisibilityContext ctx);
}