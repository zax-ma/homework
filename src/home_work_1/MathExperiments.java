package home_work_1;

public class MathExperiments {
    public static void main(String[] args) {

        // генерация случайного числа
        double  gen ;
        gen = Math.random() ;
        System.out.println("Generated number =  "  + gen);

        // IEEE 754 (Стандарт двоичной арифметики). Остаток от деления
        // одного числа на другое
        double  arg1 = 25.0;
        double arg2 = 3.0;
        System.out.println("Remainder = " +Math.IEEEremainder(arg1, arg2));

        // возведение числа в степень
        double a, b , result;
        a = 2; b = 4;
        result = Math.pow(a, b);
        System.out.println("Exponentiation =  "  + result);

        //нахождение гипотенузы
        double g = Math.hypot(3, 4);
        System.out.print("Hypotenuse = " + g+"\n");

        //Округляет дробь в большую сторону до целого числа
        double num1 = 345.9;
        double num2 = 0.666;

        System.out.println("Math.ceil(" + num1 + ")=" + Math.ceil(num1));
        System.out.println("Math.ceil(" + num2 + ")=" + Math.ceil(num2));
        System.out.println("Math.ceil(-0.22)=" + Math.ceil(-0.22));

        //Произведение заданного числа на 2 в заданной степени
        System.out.println("nMath.scalb Result of Positive Value = " + Math.scalb(2, 3));
        System.out.println("Math.scalb Result of Negative Value = " + Math.scalb(-3, 5));
        System.out.println("Math.scalb Result of Negative Value = " + Math.scalb(3, -4));
        System.out.println("Math.scalb Result of Negative Value = " + Math.scalb(-2, -2));
    }
}
