package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathExtendsMain {
    /**
     * 4.1 + 15 * 7 + (28 / 5) ^ 2.
     *
     */
    public static void main(String[] args) {

        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends(); // сработает, если в методе firstCalc будет CalculatorWithOperator, тк этот калькулятор, тк он наследует методы класса CalculatorWithOperator (он про него знает)
        System.out.println("Результат калькулятора CalculatorWithMathExtends: " + firstCalc(calc3));

        CalculatorWithOperator calc = new CalculatorWithOperator();
        System.out.println(firstCalc(calc));

    }

    public static double firstCalc(CalculatorWithOperator calc){
        double div = calc.division(28, 5);
        double pow = calc.power(div, 2);
        double mult = calc.multiplication(15, 7);
        double plus = calc.addition(mult, pow);

        return calc.addition(4.1, plus);
    }

}






