package assign8.account;

import assign8.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Account {
    private final int accountNumber;
    private BigDecimal balance;

    private BigDecimal percentage;
    private List<TransactionLogItem> transactionLogItems;

    Account(int accountNumber, BigDecimal percentage) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
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

    void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
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
                percentage.equals(account.percentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance, percentage);
    }

    public abstract BigDecimal applyPercentage();

    void addTransactionLogItem(String logMessage, BigDecimal oldBalance, BigDecimal newBalance) {
        LocalDateTime dateTime = LocalDateTime.now();
        TransactionLogItem transactionLogItem = new TransactionLogItem(dateTime, logMessage, oldBalance, newBalance);
        System.out.println(transactionLogItem.toString());
        this.transactionLogItems.add(transactionLogItem);
    }

    public List<TransactionLogItem> getTransactionLogItems() {
        List<TransactionLogItem> transactionLogCopy = new ArrayList<>(this.transactionLogItems);
        return transactionLogCopy;
    }

    abstract BigDecimal allowedAmount(BigDecimal amount);


    public BigDecimal depositMoney(BigDecimal amount) {
        addTransactionLogItem("Amount " + amount + " has been deposited",
                this.balance, this.balance.add(amount));
        this.balance = this.balance.add(amount);
        return getBalance();
    }

    public abstract BigDecimal withdrawMoney(BigDecimal amount) throws ReachedCreditLimitException, NoSufficientFundsException;

    public BigDecimal transfer(int toAccountNumber, BigDecimal amount) throws NoSufficientFundsException, AccountNotFoundException {
        if (amount.compareTo(allowedAmount(amount)) < 1) {
            addTransactionLogItem("Amount " + amount + " has been transferred",
                    this.balance, this.balance.add(amount.negate()));
            this.balance = this.balance.add(amount.negate());
            Account toAccount = NationalBank.NATIONAL_BANK.getAccountByNumber(toAccountNumber);
            toAccount.depositMoney(amount);
            return getBalance();
        } else {
            throw new NoSufficientFundsException("No sufficient funds available.", allowedAmount(amount));
        }
    }

}

