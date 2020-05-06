package assign8;

import java.math.BigDecimal;

public class BankApplication {
    private static final String ALIOR_BANK_NAME = "Alior Bank";
    private static final String MBANK_BANK_NAME = "mBank";

    public static void main(String[] args) {
        init();

        //TODO: perform topUp operations with accounts
        //TODO: perform withDraw operations with accounts
        //TODO: perform transferMoney between different accounts
        //TODO: perform apply percentage on different accounts
        //TODO: cover all the cases, not positive only
    }

    private static void init() {
        NationalBank nb = NationalBank.NATIONAL_BANK;

        Bank alior = new Bank(ALIOR_BANK_NAME);
        Bank mbank = new Bank(MBANK_BANK_NAME);

        nb.registerBank(alior);
        nb.registerBank(mbank);

        alior.openAccount(BigDecimal.valueOf(8), BigDecimal.valueOf(10_000));
        alior.openAccount(BigDecimal.valueOf(0.5));

        mbank.openAccount(BigDecimal.valueOf(6), BigDecimal.valueOf(5_000));
        mbank.openAccount(BigDecimal.valueOf(0.45));


//        Account mbankDeposit = new DepositAccount(BigDecimal.valueOf(0.45));
//        Account mbankCredit = new CreditAccount(BigDecimal.valueOf(6), BigDecimal.valueOf(5_000));
//        mbank.addAccount(mbankCredit);
//        mbank.addAccount(mbankDeposit);
    }
}