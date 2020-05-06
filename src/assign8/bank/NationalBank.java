package assign8.bank;

import java.util.*;

public class NationalBank {
    public static final NationalBank NATIONAL_BANK = new NationalBank();
    private Set<Bank> banks;

    private NationalBank() {
        banks = new HashSet<>();
    }

    private void addBank(Bank bank) {
        this.banks.add(bank);
    }

    public Bank getBankByName(String bankName) {
        for (Bank bank : banks) {
            if (bank.getName() == bankName) {
                return bank;
            }
        }
        return null;
    }

    public boolean isOpenAccount(int accountNumber) {
        for (Bank bank : banks) {
            if (bank.isOpenAccount(accountNumber)) {
                return true;
            }
        }
        return false;
    }
}
