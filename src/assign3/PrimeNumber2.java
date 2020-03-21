package assign3;

public class PrimeNumber2 {
    public static void main(String[] args) {
        for (int n = 3; n <= 100; n++) { // primes are greater than 1
            boolean isPrime = true;
            int j = 2;
            while (isPrime) {
                if (n % j == 0) {
                    isPrime = false;
                } else {
                    j++;
                }
            }
            if (isPrime) {
                System.out.println(n);
            }
        }
    }
}