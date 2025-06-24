package operations;
import java.lang.*;
import java.lang.Math;

public class CalculationLogic {

    public double addition(double a, double b) { return a + b; }

    public double subtraction(double a, double b) { return a - b; }

    public double multiplication(double a, double b) { return a * b; }

    public double division(double a, double b) {
        if (b == 0) throw new ArithmeticException("Zero division error!");
        return a / b;
    }

    public double squareRoot(double a) { return Math.sqrt(a); }

    public double power(double a, double b) { return Math.pow(a, b);}

    // TO DO
    public double percentage(double a, double b, char operator) {
        return switch (operator) {
            case '+' -> a + (a * b / 100);
            case '-' -> a - (a * b / 100);
            case '*' -> a * (b / 100);
            case '/' -> {
                if (b == 0) throw new ArithmeticException("Zero division error!");
                yield a / (b / 100);
            }
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };
}
}
