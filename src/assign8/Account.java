package assign8;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;

public abstract class Account {
    private final int accountNumber;
    private BigDecimal balance;
    private BigDecimal creditLimit;
    private BigDecimal percentage;
    private List<String> transactionLog;

    protected Account(int accountNumber, BigDecimal percentage) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
        this.creditLimit = BigDecimal.ZERO;
        this.percentage = percentage;
        transactionLog = new ArrayList<>();
        addTransactionLog("Account " + accountNumber + " has been opened");
    }

    protected Account(int accountNumber, BigDecimal percentage, BigDecimal creditLimit) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
        this.creditLimit = creditLimit;
        this.percentage = percentage;
        transactionLog = new ArrayList<>();
        addTransactionLog("Account " + accountNumber + " has been opened");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", percentage=" + percentage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber &&
                balance.equals(account.balance) &&
                creditLimit.equals(account.creditLimit) &&
                percentage.equals(account.percentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance, creditLimit, percentage);
    }

    public abstract BigDecimal applyPercentage();

    protected void addTransactionLog(String logMessage) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(ISO_LOCAL_DATE_TIME) + ": " + logMessage);
        this.transactionLog.add(dateTime.format(ISO_LOCAL_DATE_TIME) + ": " + logMessage);
    }

    private BigDecimal allowedAmount(BigDecimal amount) {
        BigDecimal balance = this.balance;
        BigDecimal balancePlusCredit = balance.add(creditLimit);
        BigDecimal allowedAmount = balancePlusCredit.min(amount);
        return allowedAmount;
    }

    public List<String> getTransactionLog () {
        List<String> transactionLogCopy = new ArrayList<>(this.transactionLog);
        return transactionLogCopy;
    }

    public BigDecimal depositMoney(BigDecimal amount) {
        BigDecimal oldBalance = this.balance;
        BigDecimal newBalance = oldBalance.add(amount);
        addTransactionLog("Amount " + amount + " has been deposited");
        return newBalance;
    }

    public BigDecimal withdrawMoney(BigDecimal amount) throws NoSufficientFundsException {
        BigDecimal oldBalance = this.balance;
        BigDecimal allowedWithdrawal = allowedAmount(amount);
        BigDecimal newBalance;
        if (amount.compareTo(allowedWithdrawal) < 1) {
            newBalance = oldBalance.add(amount.negate());
            addTransactionLog("Amount " + amount + " has been withdrawn");
            return newBalance;
        } else {
            throw new NoSufficientFundsException(allowedWithdrawal);
        }
    }

    public BigDecimal transfer(Account toAccount, BigDecimal amount) throws NoSufficientFundsException {
        BigDecimal oldBalance = this.balance;
        BigDecimal allowedWithdrawal = allowedAmount(amount);
        BigDecimal newBalance;
        if (amount.compareTo(allowedWithdrawal) < 1) {
            newBalance = oldBalance.add(amount.negate());
            addTransactionLog("Amount " + amount + " has been withdrawn");
            return newBalance;
        } else {
            throw new NoSufficientFundsException(allowedWithdrawal);
        }
    }

}

