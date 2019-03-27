package Calculations.UniNode;

import Calculations.Expression;

import java.util.function.Function;

/**
 * Unnecessary class identical to
 * UniNode with atan operator
 */
public class ArcTan extends UniNode {
    public ArcTan(Expression child) {
        super(child, a -> Math.atan(a), "atan");
    }
}
