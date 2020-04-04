package assign5;

public class FactorialRecursion {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.print(recurse(i) + " ");
        }
    }

    private static int recurse(int n) {
        if (n < 1) {
            return 1;
        }
        return recurse(n - 1) * n;
    }
}
