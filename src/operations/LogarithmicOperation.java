package operations;

import exception.CalculatorException;

public class LogarithmicOperation implements Operation {
    private double value;
    private String function;

    public LogarithmicOperation(double value, String function) {
        this.value = value;
        this.function = function;
    }

    @Override
    public double calculate() throws CalculatorException {
        switch (function) {
            case "ln":
                if (value <= 0) throw new CalculatorException("Invalid input for ln");
                return Math.log(value);
            case "log":
                if (value <= 0) throw new CalculatorException("Invalid input for log");
                return Math.log10(value);
            case "exp": return Math.exp(value);
            case "10^": return Math.pow(10, value);
            default: throw new CalculatorException("Unknown log function: " + function);
        }
    }
}