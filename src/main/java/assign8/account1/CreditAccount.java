package assign8.account1;

import java.math.BigDecimal;
import java.util.Objects;

public class CreditAccount extends Account {
    private BigDecimal creditLimit;

    public CreditAccount(int accountNumber, BigDecimal percentage, BigDecimal creditLimit) {
        super(accountNumber, percentage);
        this.creditLimit = creditLimit;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CreditAccount that = (CreditAccount) o;
        return Objects.equals(creditLimit, that.creditLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), creditLimit);
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

    @Override
    public BigDecimal withdrawMoney(BigDecimal amount) throws ReachedCreditLimitException {
        BigDecimal oldBalance = super.getBalance();
        BigDecimal allowedWithdrawal = allowedAmount(amount);
        BigDecimal newBalance;
        if (amount.compareTo(allowedWithdrawal) < 1) {
            newBalance = super.getBalance().add(amount.negate());
            addTransactionLogItem("Amount " + amount + " has been withdrawn",
                    super.getBalance(), super.getBalance().add(amount.negate()));
            super.setBalance(super.getBalance().add(amount.negate()));
            return newBalance;
        } else {
            throw new ReachedCreditLimitException("Credit limit reached", allowedWithdrawal);

        }
    }

    @Override
    BigDecimal allowedAmount(BigDecimal amount) {
        return super.getBalance().add(creditLimit).min(amount);
    }


}
