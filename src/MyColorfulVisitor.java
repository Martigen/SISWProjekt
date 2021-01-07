import java.rmi.UnexpectedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
        } else {
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
            if (ctx.op.getType() == ColorfulParser.MUL) return (Integer) left * (Integer) right;
            return (Integer) left / (Integer) right;
        } else if (left instanceof Double && right instanceof Double) {
            if (ctx.op.getType() == ColorfulParser.MUL) return (Double) left * (Double) right;
            return (Double) left / (Double) right;
        } else if (left instanceof Double && right instanceof Integer) {
            if (ctx.op.getType() == ColorfulParser.MUL) return (Double) left * (Integer) right;
            return (Double) left / (Integer) right;
        } else if (left instanceof Integer && right instanceof Double) {
            if (ctx.op.getType() == ColorfulParser.MUL) return (Integer) left * (Double) right;
            return (Integer) left / (Double) right;
        } else if (left instanceof String && right instanceof Integer) {
            return this.stringMultiplyDivide(ctx.op.getType(), left, right);
        } else if (left instanceof Integer && right instanceof String) {
            return this.stringMultiplyDivide(ctx.op.getType(), right, left);
        } else if (left instanceof Boolean && right instanceof Boolean) {
            if (ctx.op.getType() == ColorfulParser.MUL) {
                return (Boolean) left && (Boolean) right;
            } else {
                return !((Boolean) left && (Boolean) right);
            }
        } else {
            throw new Error("Wrong data types provided!");
        }
    }


    @Override
    public Object visitPwrExpr(ColorfulParser.PwrExprContext ctx) {
        Object left = this.visit(ctx.expr(0));
        Object right = this.visit(ctx.expr(1));

        if (left instanceof Double && right instanceof Double) {
            return Math.pow((Double) left, (Double) right);
        }
        else if (left instanceof Integer && right instanceof Integer) {
            return Math.pow((Integer) left, (Integer) right);
        }
        else if (left instanceof Integer && right instanceof Double) {
            return Math.pow((Integer) left, (Double) right);
        }
        else if (left instanceof Double && right instanceof Integer) {
            return Math.pow((Double) left, (Integer) right);
        }
        else {
            throw new ArithmeticException("Parameters of power method have to be type Darkgreen or Green!");
        }
    }


    @Override
    public Object visitModExpr(ColorfulParser.ModExprContext ctx) {
        Object left = this.visit(ctx.expr(0));
        Object right = this.visit(ctx.expr(1));

        if (left instanceof Double && right instanceof Double) {
            return (Double) left % (Double) right;
        }
        else if (left instanceof Integer && right instanceof Integer) {
            return (Integer) left % (Integer) right;
        }
        else if (left instanceof Integer && right instanceof Double) {
            return (Integer) left % (Double) right;
        }
        else if (left instanceof Double && right instanceof Integer) {
            return (Double) left % (Integer) right;
        }
        else {
            throw new ArithmeticException("Parameters of modulo method have to be type Darkgreen or Green!");
        }
    }

    @Override
    public Object visitSqrtExpr(ColorfulParser.SqrtExprContext ctx) {
        Object left = this.visit(ctx.expr());

        if (left instanceof Double) {
            return Math.sqrt((Double) left);
        }
        else if (left instanceof Integer) {
            return Math.sqrt((Integer) left);
        }
        else {
            throw new ArithmeticException("Parameter of square root method has to be type Darkgreen or Green!");
        }
    }

    @Override
    public Object visitFactorialExpr(ColorfulParser.FactorialExprContext ctx) {
        Object left = this.visit(ctx.expr());

        if (left instanceof Integer) {
            if ((Integer) left > 0) {
                return factorial((Integer) left);
            }
            else {
                throw new ArithmeticException("Factorial parameter has to be greater than 0!");
            }
        }
        else {
            throw new ArithmeticException("Factorial parameter has to be type Green!");
        }
    }

    @Override
    public Object visitAdditiveExpr(ColorfulParser.AdditiveExprContext ctx) {
        Object left = super.visit(ctx.expr(0));
        Object right = super.visit(ctx.expr(1));

        if (left instanceof Integer && right instanceof Integer) {
            if (ctx.op.getType() == ColorfulParser.ADD) return (Integer) left + (Integer) right;
            return (Integer) left - (Integer) right;
        } else if (left instanceof Double && right instanceof Double) {
            if (ctx.op.getType() == ColorfulParser.ADD) return (Double) left + (Double) right;
            return (Double) left - (Double) right;
        } else if (left instanceof Double && right instanceof Integer) {
            if (ctx.op.getType() == ColorfulParser.ADD) return (Double) left + (Integer) right;
            return (Double) left - (Integer) right;
        } else if (left instanceof Integer && right instanceof Double) {
            if (ctx.op.getType() == ColorfulParser.ADD) return (Integer) left + (Double) right;
            return (Integer) left - (Double) right;
        } else if (left instanceof String && right instanceof String) {
            String newLeft = ((String) left);
            String newRight = ((String) right);

            if (ctx.op.getType() == ColorfulParser.ADD) {
                return newLeft + newRight;
            } else {
                throw new Error("Subtraction of strings is not possible!");
            }
        } else if (left instanceof String && (right instanceof Double || right instanceof Integer)) {
            String newLeft = ((String) left);
            if (ctx.op.getType() == ColorfulParser.ADD) {
                return newLeft + right.toString();
            } else {
                throw new Error("Subtraction of string and numeric is not possible!");
            }
        } else if ((left instanceof Integer || left instanceof Double) && right instanceof String) {
            String newRight = ((String) right);
            if (ctx.op.getType() == ColorfulParser.ADD) {
                return left.toString() + newRight;
            } else {
                throw new Error("Subtraction of string and numeric is not possible!");
            }
        } else if (left instanceof Boolean && right instanceof Boolean) {
            if (ctx.op.getType() == ColorfulParser.ADD) {
                return (Boolean) left || (Boolean) right;
            } else {
                return !((Boolean) left || (Boolean) right);
            }
        } else {
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
            } else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
                return (Integer) left >= (Integer) right ? 1 : 0;
            } else if (ctx.op.getType() == ColorfulParser.LESS) {
                return (Integer) left < (Integer) right ? 1 : 0;
            } else {
                return (Integer) left <= (Integer) right ? 1 : 0;
            }
        } else if (left instanceof Integer && right instanceof Double) {
            if (ctx.op.getType() == ColorfulParser.GREATER) {
                return (Integer) left > (Double) right ? 1 : 0;
            } else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
                return (Integer) left >= (Double) right ? 1 : 0;
            } else if (ctx.op.getType() == ColorfulParser.LESS) {
                return (Integer) left < (Double) right ? 1 : 0;
            } else {
                return (Integer) left <= (Double) right ? 1 : 0;
            }
        } else if (left instanceof Double && right instanceof Integer) {
            if (ctx.op.getType() == ColorfulParser.GREATER) {
                return (Double) left > (Integer) right ? 1 : 0;
            } else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
                return (Double) left >= (Integer) right ? 1 : 0;
            } else if (ctx.op.getType() == ColorfulParser.LESS) {
                return (Double) left < (Integer) right ? 1 : 0;
            } else {
                return (Double) left <= (Integer) right ? 1 : 0;
            }
        } else if (left instanceof Double && right instanceof Double) {
            if (ctx.op.getType() == ColorfulParser.GREATER) {
                return (Double) left > (Double) right ? 1 : 0;
            } else if (ctx.op.getType() == ColorfulParser.GREATER_EQ) {
                return (Double) left >= (Double) right ? 1 : 0;
            } else if (ctx.op.getType() == ColorfulParser.LESS) {
                return (Double) left < (Double) right ? 1 : 0;
            } else {
                return (Double) left <= (Double) right ? 1 : 0;
            }
        } else {
            throw new Error("Wrong data types provided!");
        }
    }


    @Override
    public Object visitIf_stat(ColorfulParser.If_statContext ctx) {
        List<ColorfulParser.Condition_blockContext> conditions = ctx.condition_block();
        boolean evaluatedBlock = false;

        for (ColorfulParser.Condition_blockContext condition : conditions) {
            Object evaluated = this.visit(condition.expr());

            if (evaluated instanceof Integer) {
                if ((Integer) evaluated != 0) {
                    evaluatedBlock = true;

                    this.visit(condition.stat_block());
                    break;
                }
            } else if (evaluated instanceof Double) {
                if ((Double) evaluated != 0.0) {
                    evaluatedBlock = true;

                    this.visit(condition.stat_block());
                    break;
                }
            } else if (evaluated instanceof String) {
                if (evaluated != "") {
                    evaluatedBlock = true;

                    this.visit(condition.stat_block());
                    break;
                }
            } else if (evaluated instanceof Boolean) {
                if ((Boolean) evaluated) {
                    evaluatedBlock = true;

                    this.visit(condition.stat_block());
                    break;
                }
            }
        }

        if (!evaluatedBlock && ctx.stat_block() != null) {
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
    public Object visitFore_stat(ColorfulParser.Fore_statContext ctx) {
        String opr = ctx.op.getText();
        Object n = this.visit(ctx.expr(2));
        Object i;

        if (this.visit(ctx.expr(2)) instanceof Integer) {
            switch (opr) {
                case ">":
                    for (i = (Integer) this.visit(ctx.expr(0)); (Integer) i > (Integer) n; i = (Integer) i + (Integer) this.visit(ctx.expr(3))) {
                        this.visit(ctx.stat_block());
                    }
                    break;
                case "<":
                    for (i = (Integer) this.visit(ctx.expr(0)); (Integer) i < (Integer) n; i = (Integer) i + (Integer) this.visit(ctx.expr(3))) {
                        this.visit(ctx.stat_block());
                    }
                    break;
                case ">=":
                    for (i = (Integer) this.visit(ctx.expr(0)); (Integer) i >= (Integer) n; i = (Integer) i + (Integer) this.visit(ctx.expr(3))) {
                        this.visit(ctx.stat_block());
                    }
                    break;
                case "<=":
                    for (i = (Integer) this.visit(ctx.expr(0)); (Integer) i <= (Integer) n; i = (Integer) i + (Integer) this.visit(ctx.expr(3))) {
                        this.visit(ctx.stat_block());
                    }
                    break;
            }
        }
        else if(this.visit(ctx.expr(2)) instanceof Double) {
            switch (opr) {
                case ">":
                    for (i = (Double) this.visit(ctx.expr(0)); (Double) i > (Double) n; i = (Double) i + (Double) this.visit(ctx.expr(3))) {
                        this.visit(ctx.stat_block());
                    }
                    break;
                case "<":
                    for (i = (Double) this.visit(ctx.expr(0)); (Double) i < (Double) n; i = (Double) i + (Double) this.visit(ctx.expr(3))) {
                        this.visit(ctx.stat_block());
                    }
                    break;
                case ">=":
                    for (i = (Double) this.visit(ctx.expr(0)); (Double) i >= (Double) n; i = (Double) i + (Double) this.visit(ctx.expr(3))) {
                        this.visit(ctx.stat_block());
                    }
                    break;
                case "<=":
                    for (i = (Double) this.visit(ctx.expr(0)); (Double) i <= (Double) n; i = (Double) i + (Double) this.visit(ctx.expr(3))) {
                        this.visit(ctx.stat_block());
                    }
                    break;
            }
        }
        else {
            throw new RuntimeException("Wrong data type provided!");
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


    @Override
    public Object visitBlackInput(ColorfulParser.BlackInputContext ctx) {
        Scanner scanner = new Scanner(System.in);

        switch (ctx.type.getText()) {
            case "Green": {
                Integer inputVar = scanner.nextInt();
                System.out.println(inputVar);
                return inputVar;
            }
            case "Darkgreen": {
                Double inputVar = scanner.nextDouble();
                System.out.println(inputVar);
                return inputVar;
            }
            case "Purple": {
                String inputVar = scanner.nextLine();
                System.out.println(inputVar);
                return inputVar;
            }
            case "Brown": {
                Boolean inputVar = scanner.nextBoolean();
                System.out.println(inputVar);
                return inputVar;
            }
            default:
                throw new RuntimeException("Wrong data type provided!");
        }
    }

    @Override
    public Object visitWhiteValue(ColorfulParser.WhiteValueContext ctx) {
        Scanner scanner = new Scanner(System.in);
        String existingVariableName = ctx.parent.getParent().getChild(0).getText();

        if (memory.containsKey(existingVariableName)) {
            switch (ctx.TYPE().getText()) {
                case "Green": {
                    Integer inputVar = scanner.nextInt();
                    memory.put(ctx.parent.getChild(0).getText(), inputVar);
                    return inputVar;
                }
                case "Darkgreen": {
                    Double inputVar = scanner.nextDouble();
                    memory.put(ctx.parent.getChild(0).getText(), inputVar);
                    return inputVar;
                }
                case "Purple": {
                    String inputVar = scanner.nextLine();
                    memory.put(ctx.parent.getChild(0).getText(), inputVar);
                    return inputVar;
                }
                default:
                    throw new RuntimeException("Wrong data type provided!");
            }
        }
        else {
            throw new RuntimeException("Trying to access undefined variable!");
        }
    }


    @Override
    public Object visitAssignmentWithWhite(ColorfulParser.AssignmentWithWhiteContext ctx) {
        Scanner scanner = new Scanner(System.in);
        String newVariableName = ctx.varName.getText();

        if (!memory.containsKey(newVariableName)) {
            if (ctx.varType.getText().equals(ctx.type.getText())) {
                switch (ctx.type.getText()) {
                    case "Green": {
                        Integer inputVar = scanner.nextInt();
                        memory.put(ctx.varName.getText(), inputVar);
                        return inputVar;
                    }
                    case "Darkgreen": {
                        Double inputVar = scanner.nextDouble();
                        memory.put(ctx.varName.getText(), inputVar);
                        return inputVar;
                    }
                    case "Purple": {
                        String inputVar = scanner.nextLine();
                        memory.put(ctx.varName.getText(), inputVar);
                        return inputVar;
                    }
                    case "Brown": {
                        Boolean inputVar = scanner.nextBoolean();
                        memory.put(ctx.varName.getText(), inputVar);
                        return inputVar;
                    }
                    default:
                        throw new RuntimeException("Wrong data type provided!");
                }
            }
            else {
                throw new RuntimeException("Input variable type must be same as declared variable type!");
            }
        }
        else {
            throw new RuntimeException("This variable is already defined!");
        }
    }


    private String stringMultiplyDivide(int type, Object left, Object right) {
        String leftWithoutQuotes = ((String) left);
        StringBuilder newString = new StringBuilder();
        if (type == ColorfulParser.MUL) {
            if ((Integer) right > 0) {
                newString.append(leftWithoutQuotes.repeat(Math.max(0, (Integer) right)));
            } else if ((Integer) right < 0) {
                newString.append(leftWithoutQuotes.repeat(Math.max(0, Math.abs((Integer) right))));
                newString = newString.reverse();
            }
        } else {
            int quotient = Math.floorDiv(leftWithoutQuotes.length(), (Integer) right);
            if ((Integer) right > 0) {
                newString.append(leftWithoutQuotes, 0, quotient);
            } else if ((Integer) right < 0) {
                newString.append(leftWithoutQuotes, 0, Math.abs(quotient));
                newString = newString.reverse();
            } else {
                throw new ArithmeticException("You cannot divide by 0!");
            }
        }

        return newString.toString();
    }


    private Integer factorial(Integer i) {
        if (i == 0) return 1;
        else return i * factorial(i - 1);
    }
}
