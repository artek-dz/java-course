package assign2;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        System.out.println("Please enter three lengths.");

        double[] sides = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a length (" + (i + 1) + " out of 3): ");
            Scanner input = new Scanner(System.in);
            sides[i] = input.nextDouble();
        }

        boolean isTriangle = true;
        for (int i = 0; i < 3; i++) {
            int a = (i + 0) % 3;
            int b = (i + 1) % 3;
            int c = (i + 2) % 3;
            isTriangle = isTriangle && (sides[a] + sides[b] > sides[c]);
        }

        if (isTriangle) {
            System.out.println("You can build a triangle with these lengths.");
        } else {
            System.out.println("You can't build a triangle with these lengths.");
        }
    }
}
