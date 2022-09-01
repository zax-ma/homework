package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calc;
    private int count;

    public CalculatorWithCounterAutoComposite(){
        this.calc = new CalculatorWithMathCopy();
    }

    public double addition(double a, double b){
        incrementCountOperation();
        return this.calc.addition(a, b);
    }

    public double subtraction(double a, double b){
        incrementCountOperation();
        return this.calc.subtraction(a, b);
    }

    public double multiplication(double a, double b){
        incrementCountOperation();
        return this.calc.multiplication(a, b);
    }

    public double division(double a, double b) {
        incrementCountOperation();
        return this.calc.division(a, b);
    }

    public double power(double a, int b){
        incrementCountOperation();
        return this.calc.power(a, b);
    }

    public double abs(double a){
        incrementCountOperation();
        return this.calc.abs(a);
    }

    public double root(double a){
        incrementCountOperation();
        return this.calc.root(a);
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
