package Calculations.BiNode;

import Calculations.Expression;

/**
 * Unnecessary class identical with
 * BiNode with power operator
 * left is base, right is power
 */
public class Power extends BiNode {
    /**
     * @param left
     * @param right
     */
    public Power(Expression left, Expression right) {
        super(left, right, (v,p) -> Math.pow(v,p), "^");
    }
}
