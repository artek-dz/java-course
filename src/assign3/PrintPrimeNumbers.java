package assign3;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++) { // primes are greater than 1 i.e. 1 is not prime
            boolean isPrime = true;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
            }
        }

    }
}
