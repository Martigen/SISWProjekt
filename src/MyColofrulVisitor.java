import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MyColofrulVisitor extends ColorfulBaseVisitor<Integer> {
    Map<String, Integer> memory;

    public MyColofrulVisitor() {
        memory = new HashMap<String, Integer>();
    }

    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(ColorfulParser.AssignContext ctx) {
        String id = ctx.ID().getText();  // id is left-hand side of '='
        int value = super.visit(ctx.expr());   // compute value of expression on right
        memory.put(id, value);           // store it in our memory
        return value;
    }

    /** expr NEWLINE */
    @Override
    public Integer visitPrintExpr(ColorfulParser.PrintExprContext ctx) {
        Integer value = super.visit(ctx.expr()); // evaluate the expr child
        System.out.println(value);         // print the result
        return 0;                          // return dummy value
    }

    /** INT */
    @Override
    public Integer visitInt(ColorfulParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /** ID */
    @Override
    public Integer visitId(ColorfulParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return 0;
    }

    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMulDiv(ColorfulParser.MulDivContext ctx) {
        int left = super.visit(ctx.expr(0));  // get value of left subexpression
        int right = super.visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == ColorfulParser.MUL ) return left * right;
        return left / right; // must be DIV
    }

    /** expr op=('+'|'-') expr */
    @Override
    public Integer visitAddSub(ColorfulParser.AddSubContext ctx) {
        int left = super.visit(ctx.expr(0));  // get value of left subexpression
        int right = super.visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == ColorfulParser.ADD ) return left + right;
        return left - right; // must be SUB

    }

    /** '(' expr ')' */
    @Override
    public Integer visitParens(ColorfulParser.ParensContext ctx) {
        return super.visit(ctx.expr()); // return child expr's value
    }

    @Override
    public Integer visitGreaterEqual(ColorfulParser.GreaterEqualContext ctx) {
        int left = this.visit(ctx.expr(0));
        int right = this.visit(ctx.expr(1));

        if (ctx.op.getType() == ColorfulParser.GREATER) {
            return left > right ? 1 : 0; // 0 is false (all other values are true)
        }
        else {
            return left < right ? 1 : 0;
        }
    }

    @Override
    public Integer visitWhile(ColorfulParser.WhileContext ctx) {

        // Evaluate the relational expression and continue the while
        // loop as long as it is true (does not equal zero).
        while (this.visit(ctx.relational()) != 0) {

            // Evaluate all statements inside the while loop.
            for (ColorfulParser.StatContext stat : ctx.stat()) {
                this.visit(stat);
            }
        }

        // 0 now also is false, so maybe return null instead which would be
        // some sort of VOID value (or make a proper Value class).
        return 0;
    }

    @Override
    public Integer visitOut(ColorfulParser.OutContext ctx) {
        int value = Integer.parseInt(ctx.children.get(1).getText());
        return value;
    }

    @Override
    public Integer visitOutput(ColorfulParser.OutputContext ctx) {
        Integer value = super.visit(ctx.black()); // evaluate the expr child
        System.out.println(value);         // print the result
        return 0;
    }
}
