package assign8.account1;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    public DebitAccount(int accountNumber, BigDecimal percentage) {
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

    public BigDecimal withdrawMoney(BigDecimal amount) throws NoSufficientFundsException {
        BigDecimal oldBalance = super.getBalance();
        BigDecimal allowedWithdrawal = allowedAmount(amount);
        BigDecimal newBalance;
        if (amount.compareTo(allowedWithdrawal) < 1) {
            newBalance = oldBalance.add(amount.negate());
            addTransactionLogItem("Amount " + amount + " has been withdrawn",
                    oldBalance, newBalance);
            super.setBalance(newBalance);
            return newBalance;
        } else {
            throw new NoSufficientFundsException("No sufficient funds available.", allowedWithdrawal);
        }
    }

    BigDecimal allowedAmount(BigDecimal amount) {
        return super.getBalance().min(amount);
    }
}
