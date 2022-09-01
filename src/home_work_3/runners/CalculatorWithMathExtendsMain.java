package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathExtendsMain {
    /**
     * 4.1 + 15 * 7 + (28 / 5) ^ 2.
     *
     */
    public static void main(String[] args) {

        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();

        System.out.println("Результат калькулятора CalculatorWithMathExtends: " + firstCalc(calc3));

    }

    public static double firstCalc(CalculatorWithOperator calc){
        double div = calc.division(28, 5);
        double pow = calc.power(div, 2);
        double mult = calc.multiplication(15, 7);
        double plus = calc.addition(mult, pow);

        return calc.addition(4.1, plus);
    }

}






