package assign5;

public class FibonacciRecursion {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(recurse(i) + " ");
        }
    }

    private static int recurse(int n) {
        if (n < 2) {
            return n;
        }
        return recurse(n - 2) + recurse(n - 1);
    }
}
