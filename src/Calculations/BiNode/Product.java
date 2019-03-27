package Calculations.BiNode;

import Calculations.Expression;

/**
 * Unnecessary class identical with
 * BiNode with multiplication operation
 */
public class Product extends BiNode {
    /**
     * @param left
     * @param right
     */
    public Product(Expression left, Expression right) {
        super(left, right, (a,b) -> a*b, "*");
    }
}
