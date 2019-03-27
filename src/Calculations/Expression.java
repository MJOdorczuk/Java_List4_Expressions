package Calculations;

/**
 * Node or leaf of a calculation tree
 */
public abstract class Expression implements Calculable{
    /**
     * @param exps
     * @return sum of the values of the calculated expressions given
     */
    public static double sum(Expression... exps)
    {
        double ret = 0;
        for (Expression exp : exps) {
            ret += exp.calculate();
        }
        return ret;
    }

    /**
     * @param exps
     * @return product of the values of the calculated expressions given
     */
    public static double product(Expression... exps)
    {
        double ret = 1;
        for(Expression exp : exps){
            ret *= exp.calculate();
        }
        return ret;
    }

    /**
     * @return string representation of the node with all its children
     */
    @Override
    public abstract String toString();
}
