package assign3;


import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        System.out.print("Please provide item price: ");
        Scanner userInput = new Scanner(System.in);
        double price = userInput.nextDouble();

        System.out.print("Please input customer age: ");
        int age = userInput.nextInt();

        double discount;

        if (age < 6) {
            discount = .80;
        } else if (age <= 18) {
            discount = .25;
        } else if (age <= 65) {
            discount = 0;
        } else {
            discount = .30;
        }

        double discounted = price * (1 - discount);

        System.out.format("Discounted price: %.2f%n",discounted);
    }
}
