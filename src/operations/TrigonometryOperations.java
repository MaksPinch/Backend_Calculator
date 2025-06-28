package operations;
import exceptions.DivisionByZeroException;

public class TrigonometryOperations {
    private static double toRadians(double degrees) {
        return Math.toRadians(degrees);
    }
    public static double sin(double degrees) {
        return Math.sin(toRadians(degrees));
    }
    public static double cos(double degrees) {
        return Math.cos(toRadians(degrees));
    }
    public static double tan(double degrees) throws DivisionByZeroException {
        double rad = toRadians(degrees);
        if (Math.cos(rad) == 0) throw new DivisionByZeroException();
        return Math.tan(rad);
    }

    public static double sec(double degrees) throws DivisionByZeroException {
        double cos = cos(degrees);
        if (cos == 0) throw new DivisionByZeroException();
        return 1.0 / cos;
    }

    public static double cosec(double degrees) throws DivisionByZeroException {
        double sin = sin(degrees);
        if (sin == 0) throw new DivisionByZeroException();
        return 1.0 / sin;
    }

    public static double cot(double degrees) throws DivisionByZeroException {
        double tan = tan(degrees);
        if (tan == 0) throw new DivisionByZeroException();
        return 1.0 / tan;
    }
}
