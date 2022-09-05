package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calc8 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());

        System.out.println(firstCalc(calc8));
        System.out.println(calc8.getCountOperation());
    }
    public static double firstCalc(CalculatorWithCounterAutoAgregation calc){
        double div = calc.division(28, 5);
        double pow = calc.power(div, 2);
        double mult = calc.multiplication(15, 7);
        double plus = calc.addition(mult, pow);
        double result = calc.addition(4.1, plus);

        return result;
    }
}

