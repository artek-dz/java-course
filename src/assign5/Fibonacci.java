package assign5;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter a natural number: ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        System.out.printf("By recursion Fibonacci[%d] = %d\n", n, Fibonacci.recurse(n));
        System.out.printf("By Binet's formula Fibonacci[%d] = %d", n, Fibonacci.binet(n));
    }

    private static int recurse(int n) {
        if (n < 2) {
            return n;
        }
        return recurse(n - 2) + recurse(n - 1);
    }

    private static int binet(int n) {
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round((Math.pow(goldenRatio, n) / Math.sqrt(5)));
    }

}
