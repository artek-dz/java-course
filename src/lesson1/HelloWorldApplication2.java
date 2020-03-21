package lesson1;

import java.util.Scanner;

public class HelloWorldApplication2 {
    public static void main(String[] args) {
        System.out.println("Hello Java World!");
        System.out.println("My name is Oleg :)");

        Scanner scanner = new Scanner(System.in);

        String dog = scanner.nextLine();
        System.out.println(dog);

        int a = 10;
        int b = 15;
        int c = a + b;
        System.out.println("10 + 15 = " + a + b);
    }
}