package assign8;

public class AccountNotFoundException extends Exception {

    public AccountNotFoundException(int accountNumber) {
        System.out.println("Account number " + accountNumber + " not found");;
    }
}
