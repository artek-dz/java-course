package assign5;

public class FibonacciCalculator {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
