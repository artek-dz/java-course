package assign8;

import assign8.account.Account;
import assign8.account.AccountNotFoundException;

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


    public Bank getBank(String bankName) throws BankNotFoundException {
        for (Bank bank : banks) {
            if (bank.getName() == bankName) {
                return bank;
            }
        }
        throw new BankNotFoundException("This bank has not been found.", bankName);
    }

    public Bank getBank(int accountNumber) {
        for (Bank bank : banks) {
            if (bank.isAccountOpen(accountNumber)) {
                return bank;
            }
        }

        return null;
    }

    public boolean isAccountOpen(int accountNumber) {
        for (Bank bank : banks) {
            if (bank.isAccountOpen(accountNumber)) {
                return true;
            }
        }
        return false;
    }

    public Account getAccountByNumber(int accountNumber) throws AccountNotFoundException {
        for (Bank bank : banks) {
            if (bank.isAccountOpen(accountNumber)) {
                return bank.getAccountByNumber(accountNumber);
            }
        }
        throw new AccountNotFoundException("This account has not been found.", accountNumber);
    }
}
