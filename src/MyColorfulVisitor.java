import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyColorfulVisitor extends ColorfulBaseVisitor<Object> {
    // dla porownania zmiennoprzecinkowych wartosci
    public static final double SMALL_VALUE = 0.00000000001;
    private final Map<String, Object> memory;

    public MyColorfulVisitor() {
        memory = new HashMap<>();
    }

    @Override
    public Object visitReserveMemoryForVariable(ColorfulParser.ReserveMemoryForVariableContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.TYPE().getText();
        Object value = null;

        switch (type) {
            case "Darkgreen":
                value = 0.0;
                break;
            case "Green":
                value = 0;
                break;
            case "Purple":
                value = "";
                break;
            case "Brown":
                value = false;
                break;
        }

        memory.put(id, value);
        return value;
    }


    @Override
    public Object visitAssignment(ColorfulParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Object value = null;

        switch (ctx.TYPE().getText()) {
            case "Darkgreen":
                value = (Double) super.visit(ctx.expr());
                break;
            case "Green":
                value = (Integer) super.visit(ctx.expr());
                break;
            case "Purple":
                value = (String) super.visit(ctx.expr());
                break;
            case "Brown":
                value = (Boolean) super.visit(ctx.expr());
                break;
            default:
                throw new IllegalStateException("Unknown data type: " + ctx.TYPE().getText());
        }

        memory.put(id, value);
        return value;
    }


    @Override
    public Object visitOperateOnDeclaredVariable(ColorfulParser.OperateOnDeclaredVariableContext ctx) {
        String id = ctx.ID().getText();
        if (!memory.containsKey(id)) {
            throw new Error("Trying to access undefined variable: " + id + "!");
        }
        else {
            Object value = memory.get(id);

            if (Double.class.equals(value.getClass())) {
                value = (Double) super.visit(ctx.expr());
            } else if (Integer.class.equals(value.getClass())) {
                value = (Integer) super.visit(ctx.expr());
            } else if (String.class.equals(value.getClass())) {
                value = (String) super.visit(ctx.expr());
            } else if (Boolean.class.equals(value.getClass())) {
                value = (Boolean) super.visit(ctx.expr());
            }

            memory.put(id, value);
            return value;
        }
    }


    @Override
    public Object visitIntegerAtom(ColorfulParser.IntegerAtomContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }


    @Override
    public Object visitStringAtom(ColorfulParser.StringAtomContext ctx) {
        String string = ctx.STR().getText();
        string = string.substring(2, string.length() - 2);

        return string;
    }


    @Override
    public Object visitBooleanAtom(ColorfulParser.BooleanAtomContext ctx) {
        return Boolean.valueOf(ctx.BOOL().getText());
    }


    @Override
    public Object visitDoubleAtom(ColorfulParser.DoubleAtomContext ctx) {
        return Double.valueOf(ctx.DBL().getText());
    }


    @Override
    public Object visitIdAtom(ColorfulParser.IdAtomContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) return memory.get(id);
        throw new Error("Trying to access undefined variable: " + id + "!");
    }


    @Override
    public Object visitMultiplicationExpr(ColorfulParser.MultiplicationExprContext ctx) {
        Object left = super.visit(ctx.expr(0));
        Object right = super.visit(ctx.expr(1));

        if (left instanceof Integer && right instanceof Integer) {
            if ( ctx.op.getType() == ColorfulParser.MUL ) return (Integer) left * (Integer) right;
            return (Integer) left / (Integer) right;
        }
        else if (left instanceof Double && right instanceof Double) {
            if ( ctx.op.getType() == ColorfulParser.MUL ) return (Double) left * (Double) right;
            return (Double) left / (Double) right;
        }
        else if (left instanceof Double && right instanceof Integer) {
            if ( ctx.op.getType() == ColorfulParser.MUL ) return (Double) left * (Integer) right;
            return (Double) left / (Integer) right;
        }
        else if (left instanceof Integer && right instanceof Double) {
            if (ctx.op.getType() == ColorfulParser.MUL) return (Integer) left * (Double) right;
            return (Integer) left / (Double) right;
        }
        else if (left instanceof String && right instanceof Integer) {
            return this.stringMultiplyDivide(ctx.op.getType(), left, right);
        }
        else if (left instanceof Integer && right instanceof String) {
            return this.stringMultiplyDivide(ctx.op.getType(), right, left);
        }
        else if (left instanceof Boolean && right instanceof Boolean) {
            if (ctx.op.getType() == ColorfulParser.ADD) {
                return (Boolean) left && (Boolean) right;
            }
            else {
                return !((Boolean) left && (Boolean) right);
            }
        }
        else {
            throw new Error("Wrong data types provided!");
        }
    }


    @Override
    public Object visitAdditiveExpr(ColorfulParser.AdditiveExprContext ctx) {
        Object left = super.visit(ctx.expr(0));
        Object right = super.visit(ctx.expr(1));

        if (left instanceof Integer && right instanceof Integer) {
            if ( ctx.op.getType() == ColorfulParser.ADD ) return (Integer) left + (Integer) right;
            return (Integer) left - (Integer) right;
        }
        else if (left instanceof Double && right instanceof Double) {
            if ( ctx.op.getType() == ColorfulParser.ADD ) return (Double) left + (Double) right;
            return (Double) left - (Double) right;
        }
        else if (left instanceof Double && right instanceof Integer) {
            if ( ctx.op.getType() == ColorfulParser.ADD ) return (Double) left + (Integer) right;
            return (Double) left - (Integer) right;
        }
        else if (left instanceof Integer && right instanceof Double) {
            if (ctx.op.getType() == ColorfulParser.ADD) return (Integer) left + (Double) right;
            return (Integer) left - (Double) right;
        }
        else if (left instanceof String && right instanceof String) {
            String newLeft = ((String) left);
            String newRight = ((String) right);

            if (ctx.op.getType() == ColorfulParser.ADD) {
                return newLeft + newRight;
            }
            else {
                throw new Error("Subtraction of strings is not possible!");
            }
        }
        else if (left instanceof String && (right instanceof Double || right instanceof Integer)) {
            String newLeft = ((String) left);
            if (ctx.op.getType() == ColorfulParser.ADD) {
                return newLeft + right.toString();
            }
            else {
                throw new Error("Subtraction of string and numeric is not possible!");
            }
        }
        else if ((left instanceof Integer || left instanceof Double) && right instanceof String) {
            String newRight = ((String) right);
            if (ctx.op.getType() == ColorfulParser.ADD) {
                return left.toString() + newRight;
            }
            else {
                throw new Error("Subtraction of string and numeric is not possible!");
            }
        }
        else if (left instanceof Boolean && right instanceof Boolean) {
            if (ctx.op.getType() == ColorfulParser.ADD) {
                return (Boolean) left || (Boolean) right;
            }
            else {
                return !((Boolean) left || (Boolean) right);
            }
        }
        else {
            throw new Error("Wrong data types provided!");
        }
    }


        @Override
    public Object visitEqualityExpr(ColorfulParser.EqualityExprContext ctx) {
        Object left = this.visit(ctx.expr(0));
        Object right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case ColorfulParser.EQ:
                return left instanceof Double && right instanceof Double ?
                        (Math.abs((Double) left - (Double) right) < SMALL_VALUE ? 1 : 0) :
                        (left.equals(right) ? 1 : 0);
            case ColorfulParser.NEQ:
                return left instanceof Double && right instanceof Double ?
                        (Math.abs((Double) left - (Double) right) >= SMALL_VALUE ? 1 : 0) :
                        (!left.equals(right) ? 1 : 0);
            default:
                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
        }
    }


    @Override
    public Object visitParExpr(ColorfulParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }


    @Override
    public Object visitRelationalExpr(ColorfulParser.RelationalExprContext ctx) {
        Object left = this.visit(ctx.expr(0));
        Object right = this.visit(ctx.expr(1));

        if (left instanceof Integer && right instanceof Integer) {
            if (ctx.op.getType() == ColorfulParser.GREATER) {
                return (Integer) left > (Integer) right ? 1 : 0;
            }
            else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
                return (Integer) left >= (Integer) right ? 1 : 0;
            }
            else if (ctx.op.getType() == ColorfulParser.LESS) {
                return (Integer) left < (Integer) right ? 1 : 0;
            }
            else {
                return (Integer) left <= (Integer) right ? 1 : 0;
            }
        }
        else if (left instanceof Integer && right instanceof Double) {
            if (ctx.op.getType() == ColorfulParser.GREATER) {
                return (Integer) left > (Double) right ? 1 : 0;
            }
            else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
                return (Integer) left >= (Double) right ? 1 : 0;
            }
            else if (ctx.op.getType() == ColorfulParser.LESS) {
                return (Integer) left < (Double) right ? 1 : 0;
            }
            else {
                return (Integer) left <= (Double) right ? 1 : 0;
            }
        }
        else if (left instanceof Double && right instanceof Integer) {
            if (ctx.op.getType() == ColorfulParser.GREATER) {
                return (Double) left > (Integer) right ? 1 : 0;
            }
            else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
                return (Double) left >= (Integer) right ? 1 : 0;
            }
            else if (ctx.op.getType() == ColorfulParser.LESS) {
                return (Double) left < (Integer) right ? 1 : 0;
            }
            else {
                return (Double) left <= (Integer) right ? 1 : 0;
            }
        }
        else if (left instanceof Double && right instanceof Double) {
            if (ctx.op.getType() == ColorfulParser.GREATER) {
                return (Double) left > (Double) right ? 1 : 0;
            }
            else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
                return (Double) left >= (Double) right ? 1 : 0;
            }
            else if (ctx.op.getType() == ColorfulParser.LESS) {
                return (Double) left < (Double) right ? 1 : 0;
            }
            else {
                return (Double) left <= (Double) right ? 1 : 0;
            }
        }
        else {
            throw new Error("Wrong data types provided!");
        }
    }


    @Override
    public Object visitIf_stat(ColorfulParser.If_statContext ctx) {
        List<ColorfulParser.Condition_blockContext> conditions =  ctx.condition_block();
        boolean evaluatedBlock = false;

        for (ColorfulParser.Condition_blockContext condition : conditions) {
            Object evaluated = this.visit(condition.expr());

            if (evaluated instanceof Integer) {
                if((Integer) evaluated != 0) {
                    evaluatedBlock = true;

                    this.visit(condition.stat_block());
                    break;
                }
            }
            else if (evaluated instanceof Double) {
                if((Double) evaluated != 0.0) {
                    evaluatedBlock = true;

                    this.visit(condition.stat_block());
                    break;
                }
            }
            else if (evaluated instanceof String) {
                if(evaluated != "") {
                    evaluatedBlock = true;

                    this.visit(condition.stat_block());
                    break;
                }
            }
            else if (evaluated instanceof Boolean) {
                if((Boolean) evaluated) {
                    evaluatedBlock = true;

                    this.visit(condition.stat_block());
                    break;
                }
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            this.visit(ctx.stat_block());
        }

        return null;
    }


    @Override
    public Object visitWhile_stat(ColorfulParser.While_statContext ctx) {
        while ((Integer) this.visit(ctx.expr()) != 0) {
            this.visit(ctx.stat_block());
        }

        return null;
    }


    @Override
    public Object visitBlackValue(ColorfulParser.BlackValueContext ctx) {
        Object value = super.visitBlackValue(ctx);
        System.out.println(value.toString());
        return null;
    }

    @Override
    public Object visitBlackExpression(ColorfulParser.BlackExpressionContext ctx) {
        Object value = super.visitBlackExpression(ctx);
        System.out.println(value.toString());
        return null;
    }


    private String stringMultiplyDivide(int type, Object left, Object right) {
        String leftWithoutQuotes = ((String) left);
        StringBuilder newString = new StringBuilder();
        if (type == ColorfulParser.MUL) {
            if ((Integer) right > 0) {
                newString.append(leftWithoutQuotes.repeat(Math.max(0, (Integer) right)));
            }
            else if ((Integer) right < 0) {
                newString.append(leftWithoutQuotes.repeat(Math.max(0, Math.abs((Integer) right))));
                newString = newString.reverse();
            }
        }
        else {
            int quotient = Math.floorDiv(leftWithoutQuotes.length(), (Integer) right);
            if ((Integer) right > 0) {
                newString.append(leftWithoutQuotes, 0, quotient);
            }
            else if ((Integer) right < 0) {
                newString.append(leftWithoutQuotes, 0, Math.abs(quotient));
                newString = newString.reverse();
            }
            else {
                throw new ArithmeticException("You cannot divide by 0!");
            }
        }

        return newString.toString();
    }

//    @Override
//    public Object visitAssignment(ColorfulParser.AssignmentContext ctx) {
//        String id = ctx.ID().getText();
//        Value value = this.visit(ctx.expr());
//        return memory.put(id, value);
//    }
//
//    @Override
//    public Object visitIdAtom(ColorfulParser.IdAtomContext ctx) {
//        String id = ctx.getText();
//        Value value = memory.get(id);
//        if(value == null) {
//            throw new RuntimeException("no such variable: " + id);
//        }
//        return value;
//    }
//
//    // atom overrides
//    @Override
//    public Object visitStringAtom(ColorfulParser.StringAtomContext ctx) {
//        String str = ctx.getText();
//        // strip quotes
//        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
//        return new Value(str);
//    }
//
//    @Override
//    public Object visitNumberAtom(ColorfulParser.NumberAtomContext ctx) {
//        return new Value(Double.valueOf(ctx.getText()));
//    }
//
//    @Override
//    public Object visitBooleanAtom(ColorfulParser.BooleanAtomContext ctx) {
//        return new Value(Boolean.valueOf(ctx.getText()));
//    }
//
//
//    @Override
//    public Object visitParExpr(ColorfulParser.ParExprContext ctx) {
//        return this.visit(ctx.expr());
//    }
//
//
//    @Override
//    public Object visitMultiplicationExpr(ColorfulParser.MultiplicationExprContext ctx) {
//
//        Value left = this.visit(ctx.expr(0));
//        Value right = this.visit(ctx.expr(1));
//
//        switch (ctx.op.getType()) {
//            case ColorfulParser.MUL:
//                return new Value(left.asDouble() * right.asDouble());
//            case ColorfulParser.DIV:
//                return new Value(left.asDouble() / right.asDouble());
//            default:
//                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
//        }
//    }
//
//    @Override
//    public Object visitAdditiveExpr(ColorfulParser.AdditiveExprContext ctx) {
//
//        Value left = this.visit(ctx.expr(0));
//        Value right = this.visit(ctx.expr(1));
//
//        switch (ctx.op.getType()) {
//            case ColorfulParser.ADD:
//                return left.isDouble() && right.isDouble() ?
//                        new Value(left.asDouble() + right.asDouble()) :
//                        new Value(left.asString() + right.asString());
//            case ColorfulParser.SUB:
//                return new Value(left.asDouble() - right.asDouble());
//            default:
//                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
//        }
//    }
//
//    @Override
//    public Object visitRelationalExpr(ColorfulParser.RelationalExprContext ctx) {
//
//        Value left = this.visit(ctx.expr(0));
//        Value right = this.visit(ctx.expr(1));
//
//        switch (ctx.op.getType()) {
//            case ColorfulParser.LESS:
//                return new Value(left.asDouble() < right.asDouble());
//            case ColorfulParser.LESS_EQ:
//                return new Value(left.asDouble() <= right.asDouble());
//            case ColorfulParser.GREATER:
//                return new Value(left.asDouble() > right.asDouble());
//            case ColorfulParser.GREATER_EQ:
//                return new Value(left.asDouble() >= right.asDouble());
//            default:
//                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
//        }
//    }
//
//    @Override
//    public Object visitEqualityExpr(ColorfulParser.EqualityExprContext ctx) {
//
//        Value left = this.visit(ctx.expr(0));
//        Value right = this.visit(ctx.expr(1));
//
//        switch (ctx.op.getType()) {
//            case ColorfulParser.EQ:
//                return left.isDouble() && right.isDouble() ?
//                        new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
//                        new Value(left.equals(right));
//            case ColorfulParser.NEQ:
//                return left.isDouble() && right.isDouble() ?
//                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
//                        new Value(!left.equals(right));
//            default:
//                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
//        }
//    }
//
//
//    // if override
//    @Override
//    public Object visitIf_stat(ColorfulParser.If_statContext ctx) {
//
//        List<ColorfulParser.Condition_blockContext> conditions =  ctx.condition_block();
//
//        boolean evaluatedBlock = false;
//
//        for(ColorfulParser.Condition_blockContext condition : conditions) {
//
//            Value evaluated = this.visit(condition.expr());
//
//            if(evaluated.asBoolean()) {
//                evaluatedBlock = true;
//                // evaluate this block whose expr==true
//                this.visit(condition.stat_block());
//                break;
//            }
//        }
//
//        if(!evaluatedBlock && ctx.stat_block() != null) {
//            // evaluate the else-stat_block (if present == not null)
//            this.visit(ctx.stat_block());
//        }
//
//        return Value.VOID;
//    }
//
//    // while override
//    @Override
//    public Object visitWhile_stat(ColorfulParser.While_statContext ctx) {
//
//        Value value = this.visit(ctx.expr());
//
//        while(value.asBoolean()) {
//
//            // evaluate the code block
//            this.visit(ctx.stat_block());
//
//            // evaluate the expression
//            value = this.visit(ctx.expr());
//        }
//
//        return Value.VOID;
//    }
//
//    @Override
//    public Object visitReserveMemoryForVariable(ColorfulParser.ReserveMemoryForVariableContext ctx) {
//        String id = ctx.ID().getText();
//        String type = ctx.TYPE().getText();
//        Value value;
//
//        switch (type) {
//            case "Darkgreen":
//                value = new Value(0.0);
//                break;
//            case "Green":
//                value = new Value(0);
//                break;
//            case "Purple":
//                value = new Value("");
//                break;
//            case "Brown":
//                value = new Value(false);
//                break;
//            default:
//                throw new IllegalStateException("Unexpected type: " + type);
//        }
//
//        memory.put(id, value);
//        return value;
//    }
//
//
//    @Override
//    public Object visitOperateOnDeclaredVariable(ColorfulParser.OperateOnDeclaredVariableContext ctx) {
//        String id = ctx.ID().getText();
//        if (!memory.containsKey(id)) {
//            throw new Error("Trying to access undefined variable: " + id + "!");
//        }
//        else {
//            Value value = new Value(super.visit(ctx.expr()));
//
//            memory.put(id, value);
//            return value;
//        }
//    }
//
//    @Override
//    public Object visitBlackValue(ColorfulParser.BlackValueContext ctx) {
//        Value value = super.visitBlackValue(ctx);
//        System.out.println(value.toString());
//        return null;
//    }
//
//    @Override
//    public Object visitBlackExpression(ColorfulParser.BlackExpressionContext ctx) {
//        Value value = super.visitBlackExpression(ctx);
//        System.out.println(value.toString());
//        return null;
//    }

// OLD
    //    @Override
//    public Object visitReserveMemorySpace(ColorfulParser.ReserveMemorySpaceContext ctx) {
//        String id = ctx.ID().getText();
//        String type = ctx.TYPE().getText();
//        Object value = null;
//
//        switch (type) {
//            case "Darkgreen":
//                value = 0.0;
//                break;
//            case "Green":
//                value = 0;
//                break;
//            case "Purple":
//                value = "";
//                break;
//            case "Brown":
//                value = false;
//                break;
//        }
//
//        memory.put(id, value);
//        return value;
//    }
//
//
//    @Override
//    public Object visitMixingAssignedValues(ColorfulParser.MixingAssignedValuesContext ctx) {
//        String id = ctx.ID().getText();
//        Object value = null;
//
//        switch (ctx.TYPE().get(0).getText()) {
//            case "Darkgreen":
//                value = (Double) super.visit(ctx.expr());
//                break;
//            case "Green":
//                value = (Integer) super.visit(ctx.expr());
//                break;
//            case "Purple":
//                value = (String) super.visit(ctx.expr());
//                break;
//            case "Brown":
//                value = (Boolean) super.visit(ctx.expr());
//                break;
//            default:
//                throw new IllegalStateException("Unknown data type: " + ctx.TYPE().get(0).getText());
//        }
//
//        memory.put(id, value);
//        return value;
//    }
//
//
//    @Override
//    public Object visitOperationOnDeclaredValue(ColorfulParser.OperationOnDeclaredValueContext ctx) {
//        String id = ctx.ID().getText();
//        if (!memory.containsKey(id)) {
//            throw new Error("Trying to access undefined variable: " + id + "!");
//        }
//        else {
//            Object value = memory.get(id);
//
//            if (Double.class.equals(value.getClass())) {
//                value = (Double) super.visit(ctx.expr());
//            } else if (Integer.class.equals(value.getClass())) {
//                value = (Integer) super.visit(ctx.expr());
//            } else if (String.class.equals(value.getClass())) {
//                value = (String) super.visit(ctx.expr());
//            } else if (Boolean.class.equals(value.getClass())) {
//                value = (Boolean) super.visit(ctx.expr());
//            }
//
//            memory.put(id, value);
//            return value;
//        }
//    }
//
//
//    /** expr NEWLINE */
//    @Override
//    public Object visitPrintExpr(ColorfulParser.PrintExprContext ctx) {
//        Object value = super.visit(ctx.expr());
//        System.out.println(value);
//        return null;
//    }
//
//
//    /** INT */
//    @Override
//    public Object visitInt(ColorfulParser.IntContext ctx) {
//        return Integer.valueOf(ctx.INT().getText());
//    }
//
//
//    @Override
//    public Object visitStr(ColorfulParser.StrContext ctx) {
//        String string = ctx.STR().getText();
//        string = string.substring(2, string.length() - 2);
//
//        return string;
//    }
//
//    @Override
//    public Object visitBool(ColorfulParser.BoolContext ctx) {
//        return Boolean.valueOf(ctx.BOOL().getText());
//    }
//
//    @Override
//    public Object visitDbl(ColorfulParser.DblContext ctx) {
//        return Double.valueOf(ctx.DBL().getText());
//    }
//
//
//    /** ID */
//    @Override
//    public Object visitId(ColorfulParser.IdContext ctx) {
//        String id = ctx.ID().getText();
//        if (memory.containsKey(id)) return memory.get(id);
//        throw new Error("Trying to access undefined variable: " + id + "!");
//    }
//
//
//    /** expr op=('*'|'/') expr */
//    @Override
//    public Object visitMulDiv(ColorfulParser.MulDivContext ctx) {
//        Object left = super.visit(ctx.expr(0));
//        Object right = super.visit(ctx.expr(1));
//
//        if (left instanceof Integer && right instanceof Integer) {
//            if ( ctx.op.getType() == ColorfulParser.MUL ) return (Integer) left * (Integer) right;
//            return (Integer) left / (Integer) right;
//        }
//        else if (left instanceof Double && right instanceof Double) {
//            if ( ctx.op.getType() == ColorfulParser.MUL ) return (Double) left * (Double) right;
//            return (Double) left / (Double) right;
//        }
//        else if (left instanceof Double && right instanceof Integer) {
//            if ( ctx.op.getType() == ColorfulParser.MUL ) return (Double) left * (Integer) right;
//            return (Double) left / (Integer) right;
//        }
//        else if (left instanceof Integer && right instanceof Double) {
//            if (ctx.op.getType() == ColorfulParser.MUL) return (Integer) left * (Double) right;
//            return (Integer) left / (Double) right;
//        }
//        else if (left instanceof String && right instanceof Integer) {
//            return this.stringMultiplyDivide(ctx.op.getType(), left, right);
//        }
//        else if (left instanceof Integer && right instanceof String) {
//            return this.stringMultiplyDivide(ctx.op.getType(), right, left);
//        }
//        else if (left instanceof Boolean && right instanceof Boolean) {
//            if (ctx.op.getType() == ColorfulParser.ADD) {
//                return (Boolean) left && (Boolean) right;
//            }
//            else {
//                return !((Boolean) left && (Boolean) right);
//            }
//        }
//        else {
//            throw new Error("Wrong data types provided!");
//        }
//    }
//
//
//    /** expr op=('+'|'-') expr */
//    @Override
//    public Object visitAddSub(ColorfulParser.AddSubContext ctx) {
//        Object left = super.visit(ctx.expr(0));
//        Object right = super.visit(ctx.expr(1));
//
//        if (left instanceof Integer && right instanceof Integer) {
//            if ( ctx.op.getType() == ColorfulParser.ADD ) return (Integer) left + (Integer) right;
//            return (Integer) left - (Integer) right;
//        }
//        else if (left instanceof Double && right instanceof Double) {
//            if ( ctx.op.getType() == ColorfulParser.ADD ) return (Double) left + (Double) right;
//            return (Double) left - (Double) right;
//        }
//        else if (left instanceof Double && right instanceof Integer) {
//            if ( ctx.op.getType() == ColorfulParser.ADD ) return (Double) left + (Integer) right;
//            return (Double) left - (Integer) right;
//        }
//        else if (left instanceof Integer && right instanceof Double) {
//            if (ctx.op.getType() == ColorfulParser.ADD) return (Integer) left + (Double) right;
//            return (Integer) left - (Double) right;
//        }
//        else if (left instanceof String && right instanceof String) {
//            String newLeft = ((String) left);
//            String newRight = ((String) right);
//
//            if (ctx.op.getType() == ColorfulParser.ADD) {
//                return newLeft + newRight;
//            }
//            else {
//                throw new Error("Subtraction of strings is not possible!");
//            }
//        }
//        else if (left instanceof String && (right instanceof Double || right instanceof Integer)) {
//            String newLeft = ((String) left);
//            if (ctx.op.getType() == ColorfulParser.ADD) {
//                return newLeft + right.toString();
//            }
//            else {
//                throw new Error("Subtraction of string and numeric is not possible!");
//            }
//        }
//        else if ((left instanceof Integer || left instanceof Double) && right instanceof String) {
//            String newRight = ((String) right);
//            if (ctx.op.getType() == ColorfulParser.ADD) {
//                return left.toString() + newRight;
//            }
//            else {
//                throw new Error("Subtraction of string and numeric is not possible!");
//            }
//        }
//        else if (left instanceof Boolean && right instanceof Boolean) {
//            if (ctx.op.getType() == ColorfulParser.ADD) {
//                return (Boolean) left || (Boolean) right;
//            }
//            else {
//                return !((Boolean) left || (Boolean) right);
//            }
//        }
//        else {
//            throw new Error("Wrong data types provided!");
//        }
//    }
//
//
//    /** '(' expr ')' */
//    @Override
//    public Object visitParens(ColorfulParser.ParensContext ctx) {
//        return super.visit(ctx.expr());
//    }
//
//
//    @Override
//    public Object visitGreaterEqual(ColorfulParser.GreaterEqualContext ctx) {
//        Object left = this.visit(ctx.expr(0));
//        Object right = this.visit(ctx.expr(1));
//
//        if (left instanceof Integer && right instanceof Integer) {
//            if (ctx.op.getType() == ColorfulParser.GREATER) {
//                return (Integer) left > (Integer) right ? 1 : 0;
//            }
//            else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
//                return (Integer) left >= (Integer) right ? 1 : 0;
//            }
//            else if (ctx.op.getType() == ColorfulParser.LESS) {
//                return (Integer) left <= (Integer) right ? 1 : 0;
//            }
//            else {
//                return (Integer) left < (Integer) right ? 1 : 0;
//            }
//        }
//        else if (left instanceof Integer && right instanceof Double) {
//            if (ctx.op.getType() == ColorfulParser.GREATER) {
//                return (Integer) left > (Double) right ? 1 : 0;
//            }
//            else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
//                return (Integer) left >= (Double) right ? 1 : 0;
//            }
//            else if (ctx.op.getType() == ColorfulParser.LESS) {
//                return (Integer) left <= (Double) right ? 1 : 0;
//            }
//            else {
//                return (Integer) left < (Double) right ? 1 : 0;
//            }
//        }
//        else if (left instanceof Double && right instanceof Integer) {
//            if (ctx.op.getType() == ColorfulParser.GREATER) {
//                return (Double) left > (Integer) right ? 1 : 0;
//            }
//            else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
//                return (Double) left >= (Integer) right ? 1 : 0;
//            }
//            else if (ctx.op.getType() == ColorfulParser.LESS) {
//                return (Double) left <= (Integer) right ? 1 : 0;
//            }
//            else {
//                return (Double) left < (Integer) right ? 1 : 0;
//            }
//        }
//        else if (left instanceof Double && right instanceof Double) {
//            if (ctx.op.getType() == ColorfulParser.GREATER) {
//                return (Double) left > (Double) right ? 1 : 0;
//            }
//            else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
//                return (Double) left >= (Double) right ? 1 : 0;
//            }
//            else if (ctx.op.getType() == ColorfulParser.LESS) {
//                return (Double) left <= (Double) right ? 1 : 0;
//            }
//            else {
//                return (Double) left < (Double) right ? 1 : 0;
//            }
//        }
//        else {
//            throw new Error("Wrong data types provided!");
//        }
//    }
//
//
//    @Override
//    public Object visitWhile(ColorfulParser.WhileContext ctx) {
//        // Evaluate the relational expression and continue the while
//        // loop as long as it is true (does not equal zero).
//        while ((Integer) this.visit(ctx.relational()) != 0) {
//
//            // Evaluate all statements inside the while loop.
//            for (ColorfulParser.StatContext stat : ctx.stat()) {
//                this.visit(stat);
//            }
//        }
//
//        // 0 now also is false, so maybe return null instead which would be
//        // some sort of VOID value (or make a proper Value class).
//        return null;
//    }
//
//
//    @Override
//    public Object visitOut(ColorfulParser.OutContext ctx) {
//        return ctx.children.get(1).getText();
//    }
//
//
//    @Override
//    public Object visitOutput(ColorfulParser.OutputContext ctx) {
//        Object value = super.visit(ctx.black());
//        System.out.println(value);
//        return null;
//    }
//
//
//    private String stringMultiplyDivide(int type, Object left, Object right) {
//        String leftWithoutQuotes = ((String) left);
//        StringBuilder newString = new StringBuilder();
//        if (type == ColorfulParser.MUL) {
//            if ((Integer) right > 0) {
//                newString.append(leftWithoutQuotes.repeat(Math.max(0, (Integer) right)));
//            }
//            else if ((Integer) right < 0) {
//                newString.append(leftWithoutQuotes.repeat(Math.max(0, Math.abs((Integer) right))));
//                newString = newString.reverse();
//            }
//        }
//        else {
//            int quotient = Math.floorDiv(leftWithoutQuotes.length(), (Integer) right);
//            if ((Integer) right > 0) {
//                newString.append(leftWithoutQuotes, 0, quotient);
//            }
//            else if ((Integer) right < 0) {
//                newString.append(leftWithoutQuotes, 0, Math.abs(quotient));
//                newString = newString.reverse();
//            }
//            else {
//                throw new ArithmeticException("You cannot divide by 0!");
//            }
//        }
//
//        return newString.toString();
//    }
}
