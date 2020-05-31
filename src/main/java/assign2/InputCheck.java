package assign2;

import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args) {
        String userText;
        boolean userTypedExit;
        do {
            System.out.print("Enter some text: ");
            Scanner userInput = new Scanner(System.in);
            userText = userInput.nextLine();
            userTypedExit = userText.equalsIgnoreCase("exit");
        } while (!userTypedExit);
    }
}
