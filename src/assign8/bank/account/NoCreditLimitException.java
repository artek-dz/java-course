package assign8.bank.account;

public class NoCreditLimitException extends Exception {
    public NoCreditLimitException() {
        System.out.println("No Credit Limit available for Deposit Accounts");
    }
}
