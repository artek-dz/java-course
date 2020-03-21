package assign1;

import java.util.Scanner;

public class SimpleAlgebra {
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		int c = a + b;
		System.out.println("10 + 15 = " + c);
		System.out.println("10 + 15 = " + (a + b)); // the same as before
		System.out.println("10 + 15 = " + a + b); // a and b are treated as concatenations of strings
	}
}