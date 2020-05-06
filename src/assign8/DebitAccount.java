package assign8;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    protected DebitAccount(int accountNumber, BigDecimal percentage) {
        super(accountNumber, percentage);
    }

    @Override
    public BigDecimal applyPercentage() {
        BigDecimal oldBalance = super.getBalance();
        BigDecimal percentage = oldBalance.multiply(super.getPercentage().divide(BigDecimal.valueOf(100)));
        BigDecimal newBalance = oldBalance.add(percentage);
        super.addTransactionLogItem("Percentage " + percentage + " has been added",
                oldBalance, newBalance);
        return newBalance;
    }
}
