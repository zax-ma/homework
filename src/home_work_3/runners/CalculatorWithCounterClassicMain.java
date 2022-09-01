package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;


public class CalculatorWithCounterClassicMain {
    /**
     * 4.1 + 15 * 7 + (28 / 5) ^ 2.
     *
     */
    public static void main(String[] args) {

        CalculatorWithCounterClassic calc4 = new CalculatorWithCounterClassic();

        System.out.println("Результат калькулятора CalculatorWithCounterClassic: " + firstCalc(calc4));
        System.out.println("Результат подсчета количества использования калькулятора: " + calc4.getCountOperation());


    }

    public static double firstCalc(CalculatorWithCounterClassic calc){
        double div = calc.division(28, 5);
        calc.incrementCountOperation();
        double pow = calc.power(div, 2);
        calc.incrementCountOperation();
        double mult = calc.multiplication(15, 7);
        calc.incrementCountOperation();
        double plus = calc.addition(mult, pow);
        calc.incrementCountOperation();
        double result = calc.addition(4.1, plus);
        calc.incrementCountOperation();

        return result;
    }

}






