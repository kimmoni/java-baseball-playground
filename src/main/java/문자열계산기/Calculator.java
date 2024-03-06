package 문자열계산기;

public class Calculator {
    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b <= 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
