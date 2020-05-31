package assign1;

import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input first number: "); 
		int a = scanner.nextInt();
		
		System.out.print("Input second number: "); 
		int b = scanner.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a+b));
	}
}