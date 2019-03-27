package Calculations.UniNode;

import Calculations.Expression;

import java.util.function.Function;

/**
 * Class for calculations on trees
 * It corresponds to a unary node with operation
 * represented by operator variable
 */
public class UniNode extends Expression {
    private final Expression child;
    private final Function<Double, Double> operator;
    private final String opSig;

    /**
     * @param child
     * @param operator
     * @param opSig
     */
    public UniNode(Expression child, Function<Double, Double> operator, String opSig) {
        this.child = child;
        this.operator = operator;
        this.opSig = opSig;
    }

    /**
     * @return
     */
    @Override
    public double calculate() {
        return operator.apply(child.calculate());
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return opSig + "(" + child.toString() + ")";
    }
}
