// Generated from /home/dizz/IdeaProjects/SISWProjekt/Colorful.g4 by ANTLR 4.9
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
	 * Visit a parse tree produced by {@link ColorfulParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(ColorfulParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ColorfulParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ColorfulParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#reserveMemoryForVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserveMemoryForVariable(ColorfulParser.ReserveMemoryForVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ColorfulParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#operateOnDeclaredVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperateOnDeclaredVariable(ColorfulParser.OperateOnDeclaredVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(ColorfulParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(ColorfulParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(ColorfulParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(ColorfulParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#blackValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlackValue(ColorfulParser.BlackValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ColorfulParser#blackExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlackExpression(ColorfulParser.BlackExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pwrExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPwrExpr(ColorfulParser.PwrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(ColorfulParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(ColorfulParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(ColorfulParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(ColorfulParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link ColorfulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(ColorfulParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(ColorfulParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAtom(ColorfulParser.IntegerAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleAtom(ColorfulParser.DoubleAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(ColorfulParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(ColorfulParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link ColorfulParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(ColorfulParser.StringAtomContext ctx);
}