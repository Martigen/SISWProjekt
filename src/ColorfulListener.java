// Generated from D:/Szkola/Semestr_9/SISW/SISWProjekt\Colorful.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ColorfulParser}.
 */
public interface ColorfulListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ColorfulParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ColorfulParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(ColorfulParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(ColorfulParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ColorfulParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ColorfulParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(ColorfulParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(ColorfulParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relat}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRelat(ColorfulParser.RelatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relat}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRelat(ColorfulParser.RelatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code output}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOutput(ColorfulParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code output}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOutput(ColorfulParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInput(ColorfulParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInput(ColorfulParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(ColorfulParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(ColorfulParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code out}
	 * labeled alternative in {@link ColorfulParser#black}.
	 * @param ctx the parse tree
	 */
	void enterOut(ColorfulParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code out}
	 * labeled alternative in {@link ColorfulParser#black}.
	 * @param ctx the parse tree
	 */
	void exitOut(ColorfulParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in}
	 * labeled alternative in {@link ColorfulParser#white}.
	 * @param ctx the parse tree
	 */
	void enterIn(ColorfulParser.InContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in}
	 * labeled alternative in {@link ColorfulParser#white}.
	 * @param ctx the parse tree
	 */
	void exitIn(ColorfulParser.InContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(ColorfulParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(ColorfulParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ColorfulParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ColorfulParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ColorfulParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ColorfulParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ColorfulParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ColorfulParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ColorfulParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ColorfulParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEqual}
	 * labeled alternative in {@link ColorfulParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqual(ColorfulParser.GreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqual}
	 * labeled alternative in {@link ColorfulParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqual(ColorfulParser.GreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link ColorfulParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ColorfulParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ColorfulParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ColorfulParser.WhileContext ctx);
}