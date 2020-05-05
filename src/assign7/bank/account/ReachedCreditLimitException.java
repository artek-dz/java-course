package assign7.bank.account;

import java.math.BigDecimal;

public class ReachedCreditLimitException extends Exception {
    public ReachedCreditLimitException(BigDecimal availableFunds) {
        System.out.println("Credit Limit reached. Available funds: " + availableFunds);
    }
}
