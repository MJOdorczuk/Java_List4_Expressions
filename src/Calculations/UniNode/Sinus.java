package Calculations.UniNode;

import Calculations.Expression;

/**
 * Unnecessary class identical to
 * UniNode with sin operator
 */
public class Sinus extends UniNode {
    public Sinus(Expression child) {
        super(child, a -> Math.sin(a), "sin");
    }
}
