package assign8;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    protected CreditAccount(int accountNumber, BigDecimal percentage, BigDecimal creditLimit) {
        super(accountNumber, percentage, creditLimit);
    }

    @Override
    public BigDecimal applyPercentage() {
        BigDecimal oldBalance = super.getBalance();
        BigDecimal percentage = oldBalance.multiply(super.getPercentage());
        BigDecimal newBalance = oldBalance.add(percentage);
        super.addTransactionLog("Percentage " + percentage + " has been added");
        return newBalance;
    }
}
