package Calculations.BiNode;

import Calculations.Expression;

import java.util.function.BiFunction;

/**
 *  Class for calculations on trees
 *  It corresponds to a binary node with operation
 *  represented by operator variable
 */
public class BiNode extends Expression {
    private final Expression left, right;
    private final BiFunction<Double,Double,Double> operator;
    private final String opSing;

    /**
     * @param left
     * @param right
     * @param operator
     * @param opSing
     */
    public BiNode(Expression left, Expression right, BiFunction<Double, Double, Double> operator, String opSing) {
        this.left = left;
        this.right = right;
        this.operator = operator;
        this.opSing = opSing;
    }

    /**
     * @return
     */
    @Override
    public double calculate() {
        return operator.apply(left.calculate(),right.calculate());
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "(" + left.toString() + ")" + opSing + "(" + right.toString() + ")";
    }
}
