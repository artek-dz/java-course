package assign8;

import java.math.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Bank {
    private String name;
    private Set<Account> accounts;

    public Bank(String name) {
        this.name = name;
        accounts = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) &&
                Objects.equals(accounts, bank.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void openAccount(Account account) throws AccountAlreadyExistsException {
        int accountNumber = account.getAccountNumber();
        if (NationalBank.NATIONAL_BANK.isAccountOpen(accountNumber)) {
            throw new AccountAlreadyExistsException(accountNumber);
        }
    }

    public void openAccount(BigDecimal percentage) {
        int accountNumber = generateAccountNumber();
        DebitAccount account = new DebitAccount(accountNumber, percentage);
        this.accounts.add(account);
    }

    public void openAccount(BigDecimal percentage, BigDecimal creditLimit) {
        int accountNumber = generateAccountNumber();
        CreditAccount account = new CreditAccount(accountNumber, percentage, creditLimit);
        this.accounts.add(account);
    }

    private int generateAccountNumber() {
        int accountNumber = ThreadLocalRandom.current().nextInt(99999999);
        if (NationalBank.NATIONAL_BANK.isAccountOpen(accountNumber)) {
            return generateAccountNumber();
        } else {
            return accountNumber;
        }
    }

    public Account getAccountByNumber(int accountNumber) {
        for (Account account: accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public boolean isAccountOpen (int accountNumber) {
        return accounts.contains(getAccountByNumber(accountNumber));
    }
}
