// Generated from /home/dizz/IdeaProjects/SISWProjekt/Colorful.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ColorfulParser}.
 */
public interface ColorfulListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ColorfulParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ColorfulParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ColorfulParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ColorfulParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ColorfulParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ColorfulParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#reserveMemoryForVariable}.
	 * @param ctx the parse tree
	 */
	void enterReserveMemoryForVariable(ColorfulParser.ReserveMemoryForVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#reserveMemoryForVariable}.
	 * @param ctx the parse tree
	 */
	void exitReserveMemoryForVariable(ColorfulParser.ReserveMemoryForVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ColorfulParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ColorfulParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#operateOnDeclaredVariable}.
	 * @param ctx the parse tree
	 */
	void enterOperateOnDeclaredVariable(ColorfulParser.OperateOnDeclaredVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#operateOnDeclaredVariable}.
	 * @param ctx the parse tree
	 */
	void exitOperateOnDeclaredVariable(ColorfulParser.OperateOnDeclaredVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(ColorfulParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(ColorfulParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(ColorfulParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(ColorfulParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(ColorfulParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(ColorfulParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(ColorfulParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(ColorfulParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#blackValue}.
	 * @param ctx the parse tree
	 */
	void enterBlackValue(ColorfulParser.BlackValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#blackValue}.
	 * @param ctx the parse tree
	 */
	void exitBlackValue(ColorfulParser.BlackValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorfulParser#blackExpression}.
	 * @param ctx the parse tree
	 */
	void enterBlackExpression(ColorfulParser.BlackExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorfulParser#blackExpression}.
	 * @param ctx the parse tree
	 */
	void exitBlackExpression(ColorfulParser.BlackExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pwrExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPwrExpr(ColorfulParser.PwrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pwrExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPwrExpr(ColorfulParser.PwrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModExpr(ColorfulParser.ModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModExpr(ColorfulParser.ModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrtExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSqrtExpr(ColorfulParser.SqrtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrtExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSqrtExpr(ColorfulParser.SqrtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(ColorfulParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(ColorfulParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(ColorfulParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(ColorfulParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(ColorfulParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(ColorfulParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(ColorfulParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(ColorfulParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorialExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFactorialExpr(ColorfulParser.FactorialExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorialExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFactorialExpr(ColorfulParser.FactorialExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(ColorfulParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(ColorfulParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(ColorfulParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(ColorfulParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAtom(ColorfulParser.IntegerAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAtom(ColorfulParser.IntegerAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDoubleAtom(ColorfulParser.DoubleAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDoubleAtom(ColorfulParser.DoubleAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(ColorfulParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(ColorfulParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(ColorfulParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(ColorfulParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(ColorfulParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(ColorfulParser.StringAtomContext ctx);
}