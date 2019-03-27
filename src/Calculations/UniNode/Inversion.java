package Calculations.UniNode;

import Calculations.Expression;

/**
 * Unnecessary class identical to
 * UniNode with inversion operator
 */
public class Inversion extends UniNode {
    public Inversion(Expression child) {
        super(child, a -> 1/a, "1/");
    }
}
