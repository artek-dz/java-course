package assign2;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        System.out.println("Is it raining now?");
        Scanner input = new Scanner(System.in);
        String answer = input.next();

        boolean isAnswerYes = answer.equalsIgnoreCase("Yes");
        boolean isAnswerNo = answer.equalsIgnoreCase("No");

        if (isAnswerYes) {
            System.out.println("Do not forget umbrella!");
        } else if (isAnswerNo) {
            System.out.println("Leave umbrella at home.");
        }
    }
}
