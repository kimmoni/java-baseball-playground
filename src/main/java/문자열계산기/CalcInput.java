package 문자열계산기;

import java.util.Scanner;

public class CalcInput {
    public static void main(String[] args) {
        String value = getString("1 + 3 * 5 - 2 / 1");
        String[] values = splitText(value);

        double result = 0;
        for (int i = 0; i < values.length-1; i++) {
            result = calc(result, Double.parseDouble(values[i]), values[i+1]);
        }
    }

    public static String[] splitText(String value) {
        if (value.isEmpty()) {
            throw new NullPointerException();
        }
        String[] values = value.split(" ");
        return values;
    }

    public static String getString(String text) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        return value;
    }


    public static double calc(double a, double b, String opt) {
        switch (opt) {
            case "+":
                return Calculator.plus(a, b);
            case "-":
                return Calculator.minus(a, b);
            case "*":
                return Calculator.multiply(a, b);
            case "/":
                return Calculator.divide(a, b);
            default :
                throw new RuntimeException();
        }
    }
}
