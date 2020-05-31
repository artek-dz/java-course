package assign8;

import assign8.account1.Account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class NationalBank {
    public static final NationalBank NATIONAL_BANK = new NationalBank();
    private Set<Bank> banks;

    private NationalBank() {
        banks = new HashSet<>();
    }

    public void registerBank(Bank bank) {

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")) + ": " + bank.getName() + " has been registered at National Bank");
        this.banks.add(bank);
    }


    public Optional<Bank> getBank(String bankName) {
        for (Bank bank : banks) {
            if (bank.getName() == bankName) {
                return Optional.of(bank);
            }
        }
        return Optional.empty();
    }

    public Optional<Bank> getBank(int accountNumber) {
        for (Bank bank : banks) {
            if (bank.isAccountOpen(accountNumber)) {
                return Optional.of(bank);
            }
        }
        return Optional.empty();
    }

    public boolean isAccountOpen(int accountNumber) {
        for (Bank bank : banks) {
            if (bank.isAccountOpen(accountNumber)) {
                return true;
            }
        }
        return false;
    }

    public Optional<Account> getAccountByNumber(int accountNumber) {
        for (Bank bank : banks) {
            if (bank.isAccountOpen(accountNumber)) {
                return bank.getAccountByNumber(accountNumber);
            }
        }
        return Optional.empty();
    }
}
