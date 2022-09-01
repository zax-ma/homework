package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    private int count;
    private ICalculator calc;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc) {
        this.calc = calc;
    }

    public double addition(double a, double b){
        incrementCountOperation();
        return this.calc.addition(a, b); // обращение к родительской реализации
    }

    public double power(double a, int b) {
        incrementCountOperation();
        return this.calc.power(a, b);
    }

    public double multiplication(double a, double b) {
        incrementCountOperation();
        return this.calc.multiplication(a, b);
    }

    public double division(double a, double b) {
        incrementCountOperation();
        return this.calc.division(a, b);
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
