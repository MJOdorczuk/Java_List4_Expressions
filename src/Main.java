import Calculations.BiNode.*;
import Calculations.Calculable;
import Calculations.UniNode.ArcTan;
import Calculations.Value;
import Calculations.Variable;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,Double> varList = new HashMap<>();
        varList.put("x",2.0);
        Variable.setVarList(varList);
        Calculable test1 = new Sum(new Value(3),new Value(5));
        Calculable test2 = new Sum(new Value(2),new Product(new Variable("x"),new Value(7)));
        Calculable test3 = new Quotient(
                new Differnce(new Product(new Value(3),new Value(11)),new Value(1)),
                new Sum(new Value(7),new Value(5))
        );
        Calculable test4 = new ArcTan(
                new Quotient(new Product(new Sum(new Variable("x"),new Value(13)),new Variable("x")),
                        new Value(2))
        );
        Calculable test5 = new Sum(
                new Power(new Value(2),new Value(5)),
                new Product(new Variable("x"),new Logarithm(new Value(2),new Variable("y")))
        );
        System.out.println(test1.toString() + " = " + test1.calculate());
        System.out.println(test2.toString() + " = " + test2.calculate());
        System.out.println(test3.toString() + " = " + test3.calculate());
        System.out.println(test4.toString() + " = " + test4.calculate());
        try {
            System.out.println(test5.toString() + " = " + test5.calculate());
        }catch (Exception e)
        {
            System.err.println("the error is " + e.getMessage());
        }


    }
}
