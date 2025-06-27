package operations;

public class CombinatoricsOperations {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static long nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    public static long nPr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }
}
