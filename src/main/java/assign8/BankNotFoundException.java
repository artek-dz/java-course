package assign8;

public class BankNotFoundException extends Exception {
    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public BankNotFoundException(String message, String bankName) {
        super(message);
        this.bankName = bankName;
    }
}
