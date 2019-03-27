package Calculations.Constant;

import Calculations.Expression;

/**
 * Class for calculations on trees
 * It corresponds to a leaf with predefined value
 */
public abstract class Constant extends Expression {
    private final String constName;
    private final double constVal;

    /**
     * @param constName
     * @param constVal
     */
    public Constant(String constName, double constVal) {
        this.constName = constName;
        this.constVal = constVal;
    }

    /**
     * @return
     */
    @Override
    public double calculate() {
        return constVal;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return constName;
    }
}
