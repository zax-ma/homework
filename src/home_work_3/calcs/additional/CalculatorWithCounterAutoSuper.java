package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private int count;

    public double addition(double a, double b){
        incrementCountOperation();
        return super.addition(a, b); // обращение к родительской реализации
    }

    @Override
    public double power(double a, int b) {
        incrementCountOperation();
        return super.power(a, b);
    }

    @Override
    public double abs(double a) {
        incrementCountOperation();
        return super.abs(a);
    }

    @Override
    public double root(double a) {
        incrementCountOperation();
        return super.root(a);
    }

    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return super.subtraction(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return super.multiplication(a, b);
    }

    @Override
    public double division(double a, double b) {
        incrementCountOperation();
        return super.division(a, b);
    }

    private void incrementCountOperation(){
        incrementCountOperation(1);
    }

    private void incrementCountOperation(int count){
        this.count += count;
    }

    public long getCountOperation() {
        return this.count;
    }

}
