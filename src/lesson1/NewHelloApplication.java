package lesson1;

import java.util.Scanner;

public class NewHelloApplication {
	public static void main(String[] args) {
		System.out.println("Hello, Java World!"); 
		System.out.println("Hello, Artek :>"); 
		
		Scanner scanner = new Scanner(System.in);
		String dog = scanner.next();
		System.out.println(dog);
	}
}