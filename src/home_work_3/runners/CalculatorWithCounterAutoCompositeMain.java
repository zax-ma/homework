package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;


public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calc6 = new CalculatorWithCounterAutoComposite();


        System.out.println("Результат калькулятора CalculatorWithCounterAutoComposite: " + firstCalc(calc6));
        System.out.println("Результат подсчета количества использования калькулятора: " + calc6.getCountOperation());


    }

    public static double firstCalc(CalculatorWithCounterAutoComposite calc){
        double div = calc.division(28, 5);
        double pow = calc.power(div, 2);
        double mult = calc.multiplication(15, 7);
        double plus = calc.addition(mult, pow);
        double result = calc.addition(4.1, plus);

        return result;
    }
}
