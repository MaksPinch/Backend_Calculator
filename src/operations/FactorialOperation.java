package operations;

import exception.CalculatorException;

public class FactorialOperation implements Operation {
    private int n;

    public FactorialOperation(int n) {
        this.n = n;
    }

    @Override
    public double calculate() throws CalculatorException {
        if (n < 0) throw new CalculatorException("Factorial of negative number");
        double result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
}



