package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public double addition(double a, double b){
        return a + b;
    }

    public double subtraction(double a, double b){
        return a - b;
    }

    public double multiplication(double a, double b){
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double power(double a, int b){
        double res = a;
        for (int i = 1; i < b; i++) {
            res *= a;
        }
        return res;
    }

    public double abs(double a){
        return a < 0 ? -a : a;
    }

    public double root(double a){
        return Math.sqrt(a);
    }


}
