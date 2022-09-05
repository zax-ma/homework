package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoSuperMain {
    /**
     * 4.1 + 15 * 7 + (28 / 5) ^ 2.
     *
     */
    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calc5 = new CalculatorWithCounterAutoSuper();
        CalculatorWithOperator calc = new CalculatorWithOperator();
        CalculatorWithMathExtends calc2 = new CalculatorWithMathExtends();
        CalculatorWithCounterClassic calc3 = new CalculatorWithCounterClassic();

        System.out.println("Результат калькулятора CalculatorWithCounterAutoSuper: " + firstCalc(calc5));
        System.out.println("Результат подсчета количества использования калькулятора: " + calc5.getCountOperation());

        System.out.println(firstCalc(calc));
        System.out.println(firstCalc(calc2));
        System.out.println(firstCalc(calc3));
        System.out.println(calc3.getCountOperation());

    }

    public static double firstCalc(CalculatorWithOperator calc){
        double div = calc.division(28, 5);
        double pow = calc.power(div, 2);
        double mult = calc.multiplication(15, 7);
        double plus = calc.addition(mult, pow);
        double result = calc.addition(4.1, plus);

        return result;
    }

}






