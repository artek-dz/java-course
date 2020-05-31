package lesson3;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 10, -2, 20, 15};

        int maximum = numbers[0];

        System.out.println("normal for-loop");
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        System.out.println(maximum);

        System.out.println("enhanced for-loop");

        maximum = numbers[0];

        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        System.out.println(maximum);
    }
}
