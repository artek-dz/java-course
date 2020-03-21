package assign1;

import java.util.Scanner;

public class GreetUser {
	public static void main(String[] args) {
		System.out.println("Hello. Please, input your name:"); 
		
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		System.out.println("Nice to meet you, "+userName+"!");
	}
}