package Calculations.BiNode;

import Calculations.Expression;

/**
 * Unnecessary class identical with
 * BiNode with logarithm operator
 * left is base, right is value
 */
public class Logarithm extends BiNode {
    public Logarithm(Expression left, Expression right) {
        super(left, right, (b,v) -> Math.log(v)/Math.log(b), "log");
    }
}
