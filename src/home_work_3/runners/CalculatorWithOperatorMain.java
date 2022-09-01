package home_work_3.runners;


import home_work_3.calcs.simple.CalculatorWithOperator;


public class CalculatorWithOperatorMain {
    /**
     * 4.1 + 15 * 7 + (28 / 5) ^ 2.
     *
     */
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
    //    CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();


        System.out.println("Результат калькулятора CalculatorWithOperator: " + firstCalc(calc));
     //   System.out.println("Результат калькулятора CalculatorWithMathCopy: " + firstCalc(calc2));

    }

    public static double firstCalc(CalculatorWithOperator calc){
        double div = calc.division(28, 5);
        double pow = calc.power(div, 2);
        double mult = calc.multiplication(15, 7);
        double plus = calc.addition(mult, pow);

        return calc.addition(4.1, plus);
    }

}






