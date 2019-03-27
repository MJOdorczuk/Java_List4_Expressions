package Calculations.UniNode;

import Calculations.Expression;

/**
 * Unnecessary class identical to
 * UniNode with cos operator
 */
public class Cosinus extends UniNode {
    public Cosinus(Expression child) {
        super(child, a -> Math.cos(a), "cos");
    }
}
