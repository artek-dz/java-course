package assign7.bank.account;

import java.math.BigDecimal;

public class NoSufficientFundsException extends Exception {
    public NoSufficientFundsException(BigDecimal availableFunds) {
        System.out.println("No sufficient funds for this operation. Available funds: " + availableFunds);
    }
}
