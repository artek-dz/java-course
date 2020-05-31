package assign8.account1;

public class AccountAlreadyExistsException extends Exception {
    private int accountNumber;

    public AccountAlreadyExistsException(String message, int accountNumber) {
        super(message);
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
