package assign2;

public class SimpleSwap {
    public static void main(String[] args) {
        int[] numbers = {10, 20};
        System.out.println("orignal numbers = {" + numbers[0] + ", " + numbers[1] + "}");
        int firstNumber = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = firstNumber;
        System.out.println("swapped numbers = {" + numbers[0] + ", " + numbers[1] + "}");
    }
}
