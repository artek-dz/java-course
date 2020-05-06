package assign8;

public class BankNotFoundException extends Exception {

    public BankNotFoundException(String bankName) {
        System.out.println("Bank " + bankName + " not found");;
    }
}
