package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoChoiceAgregation calc7 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAgregation calc7_2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation calc7_3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        System.out.println("Результат работы CalculatorWithMathCopy: "+firstCalc(calc7));
        System.out.println(calc7.getCountOperation());
        System.out.println("Результат работы CalculatorWithOperator: "+ firstCalc(calc7_2));
        System.out.println(calc7_2.getCountOperation());
        System.out.println("Результат работы CalculatorWithMathExtends: "+ firstCalc(calc7_3));
        System.out.println(calc7_3.getCountOperation());
    }

    public static double firstCalc(CalculatorWithCounterAutoChoiceAgregation calc){
        double div = calc.division(28, 5);
        double pow = calc.power(div, 2);
        double mult = calc.multiplication(15, 7);
        double plus = calc.addition(mult, pow);
        double result = calc.addition(4.1, plus);

        return result;
    }

}
