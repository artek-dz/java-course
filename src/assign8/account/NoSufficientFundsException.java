package assign8.account;

import java.math.BigDecimal;

public class NoSufficientFundsException extends Exception {
    BigDecimal availableFunds;

    public NoSufficientFundsException(String message, BigDecimal availableFunds) {
        super(message);
        this.availableFunds = availableFunds;
    }

    public BigDecimal getAvailableFunds() {
        return availableFunds;
    }
}
