package assign8.account;

import java.math.BigDecimal;

public class ReachedCreditLimitException extends Exception {
    BigDecimal availableFunds;

    public ReachedCreditLimitException(String message, BigDecimal availableFunds) {
        super(message);
        this.availableFunds = availableFunds;
    }

    public BigDecimal getAvailableFunds() {
        return availableFunds;
    }
}
