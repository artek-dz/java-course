package assign8;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    protected CreditAccount(int accountNumber, BigDecimal percentage, BigDecimal creditLimit) {
        super(accountNumber, percentage, creditLimit);
    }

    @Override
    public BigDecimal applyPercentage() {
        BigDecimal oldBalance = super.getBalance();

        if (super.getBalance().compareTo(BigDecimal.ZERO) < 0) {
            BigDecimal percentage = oldBalance.multiply(super.getPercentage().divide(BigDecimal.valueOf(100)));
            BigDecimal newBalance = oldBalance.add(percentage);
            super.addTransactionLogItem("Percentage " + percentage + " has been deducted",
                    oldBalance, newBalance);
            return newBalance;
        } else {
            return oldBalance;
        }

    }
}
