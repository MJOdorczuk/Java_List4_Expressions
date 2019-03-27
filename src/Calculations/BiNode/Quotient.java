package Calculations.BiNode;

import Calculations.Expression;

/**
 * Unnecessary class identical with
 * BiNode with division operator
 */
public class Quotient extends BiNode {
    /**
     * @param left
     * @param right
     */
    public Quotient(Expression left, Expression right) {
        super(left, right, (a,b) -> a / b, "/");
    }
}
