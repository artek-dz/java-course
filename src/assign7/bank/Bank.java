package assign7.bank;

import assign7.bank.account.*;
import java.math.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Bank {
    private String name;
    private Set<Account> accounts;

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
        return Objects.equals(name, bank.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Account openAccount(BigDecimal percentage) {
        int accountNumber = generateAccountNumber();
        DebitAccount account = new DebitAccount(accountNumber, percentage);
        accounts.add(account);
        return account;
    }

    public Account openAccount(BigDecimal percentage, BigDecimal creditLimit) {
        int accountNumber = generateAccountNumber();
        CreditAccount account = new CreditAccount(accountNumber, percentage, creditLimit);
        accounts.add(account);
        return account;
    }

    private int generateAccountNumber() {
        int accountNumber = ThreadLocalRandom.current().nextInt();
        if (NationalBank.NATIONAL_BANK.isOpenAccount(accountNumber)) {
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

    public boolean isOpenAccount(int accountNumber) {
        return accounts.contains(getAccountByNumber(accountNumber));
    }
}
