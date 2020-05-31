package assign8.account1;

public class AccountNotFoundException extends Exception {
    private int accountNumber;

    public AccountNotFoundException(String message, int accountNumber) {
        super(message);
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
