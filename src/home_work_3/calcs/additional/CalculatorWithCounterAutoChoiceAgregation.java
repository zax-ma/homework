package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private int count;

    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc){
        this.calc1 = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc){
        this.calc2 = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc){
        this.calc3 = calc;
    }

    public double addition(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null) {
            return this.calc1.addition(a, b);
        } else if(this.calc2 != null){
            return this.calc2.addition(a, b);
        } else {
            return this.calc3.addition(a, b);
        }
    }


    public double multiplication(double a, double b){
        incrementCountOperation();
        if(this.calc1 != null) {
            return this.calc1.multiplication(a, b);
        } else if(this.calc2 != null){
            return this.calc2.multiplication(a, b);
        } else {
            return this.calc3.multiplication(a, b);
        }
    }

    public double division(double a, double b) {
        incrementCountOperation();
        if(this.calc1 != null) {
            return this.calc1.division(a, b);
        } else if(this.calc2 != null){
            return this.calc2.division(a, b);
        } else {
            return this.calc3.division(a, b);
        }
    }

    public double power(double a, int b){
        incrementCountOperation();
        if(this.calc1 != null) {
            return this.calc1.power(a, b);
        } else if(this.calc2 != null){
            return this.calc2.power(a, b);
        } else {
            return this.calc3.power(a, b);
        }
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
