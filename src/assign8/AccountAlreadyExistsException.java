package assign8;

public class AccountAlreadyExistsException extends Throwable {

    public AccountAlreadyExistsException(int accountNumber) {
        System.out.println("Account number " + accountNumber + " already exists");;
    }
}
