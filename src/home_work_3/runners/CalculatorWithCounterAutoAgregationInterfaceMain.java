package home_work_3.runners;

import home_work_3.calcs.additional.*;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregationInterfaceMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithOperator one = new CalculatorWithOperator();
        CalculatorWithMathCopy two = new CalculatorWithMathCopy();
        CalculatorWithMathExtends three = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoAgregationInterface calc1 = new CalculatorWithCounterAutoAgregationInterface(one);
        double result1 = calc1.addition((calc1.addition(4.1, calc1.multiplication(15, 7))), (calc1.power(calc1.division(28, 5), 2)));
        System.out.println("Результат CalculatorWithOperator : " + result1);
        System.out.println("Количество использования калькулятора: " + calc1.getCountOperation());

        CalculatorWithCounterAutoAgregationInterface calc2 = new CalculatorWithCounterAutoAgregationInterface(two);
        double result2 = calc2.addition((calc2.addition(4.1, calc2.multiplication(15, 7))), (calc2.power(calc2.division(28, 5), 2)));
        System.out.println("Результат CalculatorWithMathCopy : " + result2);
        System.out.println("Результат подсчета количества использования калькулятора: " + calc2.getCountOperation());

        CalculatorWithCounterAutoAgregationInterface calc3 = new CalculatorWithCounterAutoAgregationInterface(three);
        double result3 = calc3.addition((calc3.addition(4.1, calc3.multiplication(15, 7))), (calc3.power(calc3.division(28, 5), 2)));
        System.out.println("Результат CalculatorWithMathExtends : " + result3);
        System.out.println("Результат подсчета количества использования калькулятора: " + calc3.getCountOperation());
    }
}
