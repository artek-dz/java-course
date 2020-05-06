package assign8;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    protected DebitAccount(int accountNumber, BigDecimal percentage) {
        super(accountNumber, percentage);
    }

    @Override
    public BigDecimal applyPercentage() {
        BigDecimal oldBalance = super.getBalance();
        if (super.getBalance().compareTo(BigDecimal.ZERO) < 0) {
            BigDecimal percentage = oldBalance.multiply(super.getPercentage());
            percentage = percentage.negate();
            BigDecimal newBalance = oldBalance.add(percentage);
            super.addTransactionLog("Percentage " + percentage + " has been deducted");
            return newBalance;
        } else {
            return oldBalance;
        }
    }
}
