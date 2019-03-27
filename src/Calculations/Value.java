package Calculations;

/**
 * Leaf of a calculation tree with a predefined value
 */
public class Value extends Expression {

    private double value;

    public Value(double value)
    {
        this.value = value;
    }
    @Override
    public double calculate() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
