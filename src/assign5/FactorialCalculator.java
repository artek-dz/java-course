package assign5;

public class FactorialCalculator {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.print(factorial(i) + " ");
        }
    }

    private static int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
