package assign8;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Account {
    private final int accountNumber;
    private BigDecimal balance;
    private BigDecimal creditLimit;
    private BigDecimal percentage;
    private List<TransactionLogItem> transactionLogItems;

    protected Account(int accountNumber, BigDecimal percentage) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
        this.creditLimit = BigDecimal.ZERO;
        this.percentage = percentage;
        transactionLogItems = new ArrayList<>();
        addTransactionLogItem("Account " + accountNumber + " has been opened",
                this.balance, this.balance);
    }

    protected Account(int accountNumber, BigDecimal percentage, BigDecimal creditLimit) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
        this.creditLimit = creditLimit;
        this.percentage = percentage;
        transactionLogItems = new ArrayList<>();
        addTransactionLogItem("Account " + accountNumber + " has been opened",
                this.balance, this.balance);
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

    protected void addTransactionLogItem(String logMessage, BigDecimal oldBalance, BigDecimal newBalance) {
        LocalDateTime dateTime = LocalDateTime.now();
        TransactionLogItem transactionLogItem = new TransactionLogItem(dateTime, logMessage, oldBalance, newBalance);
        System.out.println(transactionLogItem.toString());
        this.transactionLogItems.add(transactionLogItem);
    }

    private BigDecimal allowedAmount(BigDecimal amount) {
        BigDecimal balance = this.balance;
        BigDecimal balancePlusCredit = balance.add(creditLimit);
        BigDecimal allowedAmount = balancePlusCredit.min(amount);
        return allowedAmount;
    }

    public List<TransactionLogItem> getTransactionLogItems() {
        List<TransactionLogItem> transactionLogCopy = new ArrayList<>(this.transactionLogItems);
        return transactionLogCopy;
    }

    public BigDecimal depositMoney(BigDecimal amount) {
        BigDecimal oldBalance = this.balance;
        BigDecimal newBalance = oldBalance.add(amount);
        addTransactionLogItem("Amount " + amount + " has been deposited",
                oldBalance, newBalance);
        this.balance = newBalance;
        return newBalance;
    }

    public BigDecimal withdrawMoney(BigDecimal amount) throws NoSufficientFundsException, ReachedCreditLimitException {
        BigDecimal oldBalance = this.balance;
        BigDecimal allowedWithdrawal = allowedAmount(amount);
        BigDecimal newBalance;
        if (amount.compareTo(allowedWithdrawal) < 1) {
            newBalance = oldBalance.add(amount.negate());
            addTransactionLogItem("Amount " + amount + " has been withdrawn",
                    oldBalance, newBalance);
            this.balance = newBalance;
            return newBalance;
        } else {
            if (this.creditLimit.equals(BigDecimal.ZERO)) {
                throw new NoSufficientFundsException(allowedWithdrawal);
            } else {
                throw new ReachedCreditLimitException(allowedWithdrawal);
            }

        }
    }

    public BigDecimal transfer(int toAccountNumber, BigDecimal amount) throws NoSufficientFundsException, AccountNotFoundException {
        BigDecimal oldBalance = this.balance;
        BigDecimal allowedWithdrawal = allowedAmount(amount);
        BigDecimal newBalance;
        if (amount.compareTo(allowedWithdrawal) < 1) {
            newBalance = oldBalance.add(amount.negate());
            addTransactionLogItem("Amount " + amount + " has been transferred",
                    oldBalance, newBalance);
            this.balance = newBalance;
            Account toAccount = NationalBank.NATIONAL_BANK.getAccountByNumber(toAccountNumber);
            toAccount.depositMoney(amount);
            return newBalance;
        } else {
            throw new NoSufficientFundsException(allowedWithdrawal);
        }
    }

}

