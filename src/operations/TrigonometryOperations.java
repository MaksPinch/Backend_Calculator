package operations;

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
    public static double tan(double degrees) {
        return Math.tan(toRadians(degrees));
    }
    public static double sec(double degrees) {
        return 1.0 / cos(degrees);
    }
    public static double cosec(double degrees) {
        return 1.0 / sin(degrees);
    }
    public static double cot(double degrees) {
        return 1.0 / tan(degrees);
    }
}
