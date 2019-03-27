package Calculations.UniNode;

import Calculations.Expression;

/**
 * Unnecessary class identical to
 * UniNode with negation operator
 */
public class Negation extends UniNode {
    public Negation(Expression child) {
        super(child, a -> - a, "-");
    }
}
