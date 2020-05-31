package assign4;

public class CheckPalindrome {
    public static boolean checkPalindrome(int number) {

        int reversedNumber = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            reversedNumber = 10 * reversedNumber;
            reversedNumber = reversedNumber + (originalNumber % 10);
            originalNumber = originalNumber / 10;
        }
        return reversedNumber==number;
    }
}