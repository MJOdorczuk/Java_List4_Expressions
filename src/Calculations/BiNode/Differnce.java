package Calculations.BiNode;

import Calculations.Expression;

/**
 * Unnecessary class identical with
 * BiNode with subtraction operator
 */
public class Differnce extends BiNode {
    /**
     * @param left
     * @param right
     */
    public Differnce(Expression left, Expression right) {
        super(left, right, (a,b) -> a - b, "-");
    }
}
