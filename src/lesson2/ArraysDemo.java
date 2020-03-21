package lesson2;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] num = new int[2];
        num[0] = 41;
        num[1] = 7;
        int sum = num[0] + num[1];
        System.out.println("Sum of two numbers: " + sum);
        System.out.println(num.length);
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
