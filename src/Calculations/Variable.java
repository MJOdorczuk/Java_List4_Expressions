package Calculations;

import java.util.*;

/**
 * Leaf of a calculation tree with externally
 * defined value
 */
public class Variable extends Expression {

    private String varName;
    private static final HashMap<String,Double> varList = new HashMap<String, Double>();

    public Variable(String varName){
        this.varName = varName;
    }

    @Override
    public double calculate() {
        try {
            return varList.get(varName);
        }
        catch(Exception e)
        {
            throw new IllegalArgumentException("Variable " + varName + " not found");
        }

    }

    public static void setVarList(HashMap<String,Double> vars)
    {
        varList.putAll(vars);
    }

    @Override
    public String toString() {
        return varName;
    }
}
