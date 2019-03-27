package Calculations.BiNode;
import Calculations.Expression;

/**
 * Unnecessary class identical with
 * BiNode with addition operator
 */
public class Sum extends BiNode {
    /**
     * @param left
     * @param right
     */
    public Sum(Expression left, Expression right) {
        super(left, right, (a,b) -> a + b, "+");
    }
}
