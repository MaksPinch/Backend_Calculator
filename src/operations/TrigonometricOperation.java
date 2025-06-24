package operations;

import exception.CalculatorException;

public class TrigonometricOperation implements Operation {
    private double value;
    private String function;
    private boolean radians;

    public TrigonometricOperation(double value, String function, boolean radians) {
        this.value = value;
        this.function = function;
        this.radians = radians;
    }

    @Override
    public double calculate() throws CalculatorException {
        double arg = radians ? value : Math.toRadians(value);
        switch (function) {
            case "sin": return Math.sin(arg);
            case "cos": return Math.cos(arg);
            case "tan": return Math.tan(arg);
            case "asin": return radians ? Math.asin(value) : Math.toDegrees(Math.asin(value));
            case "acos": return radians ? Math.acos(value) : Math.toDegrees(Math.acos(value));
            case "atan": return radians ? Math.atan(value) : Math.toDegrees(Math.atan(value));
            default: throw new CalculatorException("Unknown trig function: " + function);
        }
    }
}