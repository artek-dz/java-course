package assign2;

import java.util.Scanner;

public class WeatherForecastWithLoop {
    public static void main(String[] args) {
        boolean isAnswerYes = false;
        boolean isAnswerNo = false;
        boolean isAnswerYesOrNo = false;

        do {
            System.out.println("Is it raining now?");
            Scanner input = new Scanner(System.in);
            String answer = input.next();
            isAnswerYes = answer.equalsIgnoreCase("Yes");
            isAnswerNo = answer.equalsIgnoreCase("No");
            isAnswerYesOrNo = isAnswerYes || isAnswerNo;
        } while (!isAnswerYesOrNo);

        if (isAnswerYes) {
            System.out.println("Do not forget umbrella!");
        } else if (isAnswerNo) {
            System.out.println("Leave umbrella at home.");
        }
    }
}
