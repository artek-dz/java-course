package assign2;

import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your password: ");
        String enteredPassword = input.next();

        System.out.print("Please repeat your password: ");
        String repeatedPassword= input.next();

        if (enteredPassword.length() <= 8){
            System.out.println("Password should be at least 8 characters long!");
        } else if (repeatedPassword.equals(enteredPassword)) {
            System.out.println("Password is OK.");
        } else {
            System.out.println("Passwords should be the same!");
        }

    }
}
