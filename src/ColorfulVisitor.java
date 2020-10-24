// Generated from D:/Szkola/Semestr_9/SISW/Projekt\Colorful.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ColorfulParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ColorfulVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ColorfulParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(ColorfulParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ColorfulParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(ColorfulParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relat}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelat(ColorfulParser.RelatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code output}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(ColorfulParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ColorfulParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(ColorfulParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code out}
	 * labeled alternative in {@link ColorfulParser#black}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(ColorfulParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in}
	 * labeled alternative in {@link ColorfulParser#white}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(ColorfulParser.InContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(ColorfulParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(ColorfulParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(ColorfulParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ColorfulParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ColorfulParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEqual}
	 * labeled alternative in {@link ColorfulParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqual(ColorfulParser.GreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ColorfulParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ColorfulParser.WhileContext ctx);
}