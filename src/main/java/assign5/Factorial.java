package assign5;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.print("Enter a natural number: ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        System.out.printf("By recursion Factorial[%d] = %d\n", n, Factorial.recurse(n));
    }

    private static int recurse(int n) {
        if (n < 1) {
            return 1;
        }
        return recurse(n - 1) * n;
    }

}
