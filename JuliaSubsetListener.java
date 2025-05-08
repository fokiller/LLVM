// Generated from JuliaSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuliaSubsetParser}.
 */
public interface JuliaSubsetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JuliaSubsetParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JuliaSubsetParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#interfaceDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDecl(JuliaSubsetParser.InterfaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#interfaceDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDecl(JuliaSubsetParser.InterfaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JuliaSubsetParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JuliaSubsetParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodSignature(JuliaSubsetParser.MethodSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodSignature(JuliaSubsetParser.MethodSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(JuliaSubsetParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(JuliaSubsetParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JuliaSubsetParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JuliaSubsetParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(JuliaSubsetParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(JuliaSubsetParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecl(JuliaSubsetParser.ConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecl(JuliaSubsetParser.ConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#destructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterDestructorDecl(JuliaSubsetParser.DestructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#destructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitDestructorDecl(JuliaSubsetParser.DestructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(JuliaSubsetParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(JuliaSubsetParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(JuliaSubsetParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(JuliaSubsetParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#objectDecl}.
	 * @param ctx the parse tree
	 */
	void enterObjectDecl(JuliaSubsetParser.ObjectDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#objectDecl}.
	 * @param ctx the parse tree
	 */
	void exitObjectDecl(JuliaSubsetParser.ObjectDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JuliaSubsetParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JuliaSubsetParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(JuliaSubsetParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(JuliaSubsetParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(JuliaSubsetParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(JuliaSubsetParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(JuliaSubsetParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(JuliaSubsetParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStmt(JuliaSubsetParser.DeleteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStmt(JuliaSubsetParser.DeleteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(JuliaSubsetParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(JuliaSubsetParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(JuliaSubsetParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(JuliaSubsetParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(JuliaSubsetParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(JuliaSubsetParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(JuliaSubsetParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(JuliaSubsetParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(JuliaSubsetParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(JuliaSubsetParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(JuliaSubsetParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(JuliaSubsetParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JuliaSubsetParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JuliaSubsetParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(JuliaSubsetParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(JuliaSubsetParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(JuliaSubsetParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(JuliaSubsetParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#funcCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallStmt(JuliaSubsetParser.FuncCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#funcCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallStmt(JuliaSubsetParser.FuncCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JuliaSubsetParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JuliaSubsetParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(JuliaSubsetParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(JuliaSubsetParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(JuliaSubsetParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(JuliaSubsetParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(JuliaSubsetParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(JuliaSubsetParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(JuliaSubsetParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(JuliaSubsetParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisFieldExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThisFieldExpr(JuliaSubsetParser.ThisFieldExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisFieldExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThisFieldExpr(JuliaSubsetParser.ThisFieldExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(JuliaSubsetParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(JuliaSubsetParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAccessExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccessExpr(JuliaSubsetParser.FieldAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAccessExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccessExpr(JuliaSubsetParser.FieldAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(JuliaSubsetParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(JuliaSubsetParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(JuliaSubsetParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(JuliaSubsetParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(JuliaSubsetParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(JuliaSubsetParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(JuliaSubsetParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link JuliaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(JuliaSubsetParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaSubsetParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(JuliaSubsetParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaSubsetParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(JuliaSubsetParser.VisibilityContext ctx);
}