package operations;
import exceptions.DivisionByZeroException;
public class BasicOperations {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) throws DivisionByZeroException {
        if (b == 0) throw new DivisionByZeroException();
        return a / b;
    }
    public static int mod(int a, int b) {
        return a % b;
    }
    public static double power(double base, double exp) {
        return Math.pow(base, exp);
    }
    public static double sqrt(double value) {
        return Math.sqrt(value);
    }
    public static double abs(double value) {
        return Math.abs(value);
    }
}
