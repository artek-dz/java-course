package assign8;

import java.math.BigDecimal;

public class BankApplication {
    private static final String ALIOR_BANK_NAME = "Alior Bank";
    private static final String MBANK_BANK_NAME = "mBank";

    public static void main(String[] args) throws AccountAlreadyExistsException, AccountNotFoundException, ReachedCreditLimitException, BankNotFoundException {
        init();

        NationalBank nb = NationalBank.NATIONAL_BANK;
        try {
            nb.getBank("PKP");
        } catch (BankNotFoundException e) {
        }

        Account account1 = nb.getAccountByNumber(12345678);
        Account account2 = nb.getAccountByNumber(87654321);
        account1.depositMoney(BigDecimal.valueOf(123467));
        try {
            account1.withdrawMoney(BigDecimal.valueOf(467));
        } catch (NoSufficientFundsException e) {
        }

        try {
            account1.withdrawMoney(BigDecimal.valueOf(467344546));
        } catch (NoSufficientFundsException e) {
        }

        try {
            account1.transfer(87654321, BigDecimal.valueOf(60000));
        } catch (NoSufficientFundsException e) {
        }

        try {
            account1.transfer(87654321, BigDecimal.valueOf(65000));
        } catch (NoSufficientFundsException e) {
        }
        account1.applyPercentage();

        try {
            account2.withdrawMoney(BigDecimal.valueOf(70000));
        } catch (NoSufficientFundsException e) {
        } catch (ReachedCreditLimitException e) {
        }

        try {
            account2.withdrawMoney(BigDecimal.valueOf(64000));
        } catch (NoSufficientFundsException e) {
        }

        account2.applyPercentage();

    }

    private static void init() throws AccountAlreadyExistsException {
        NationalBank nb = NationalBank.NATIONAL_BANK;

        Bank alior = new Bank(ALIOR_BANK_NAME);
        Bank mbank = new Bank(MBANK_BANK_NAME);

        nb.registerBank(alior);
        nb.registerBank(mbank);

        alior.openAccount(BigDecimal.valueOf(8), BigDecimal.valueOf(10_000));
        alior.openAccount(BigDecimal.valueOf(0.5));

        mbank.openAccount(BigDecimal.valueOf(6), BigDecimal.valueOf(5_000));
        mbank.openAccount(BigDecimal.valueOf(0.45));

        Account aliorDebit = new DebitAccount(23456789, BigDecimal.valueOf(0.45));
        mbank.openAccount(aliorDebit);

        Account aliorCredit = new CreditAccount(98765432, BigDecimal.valueOf(6), BigDecimal.valueOf(5_000));
        mbank.openAccount(aliorCredit);

        Account mbankDebit = new DebitAccount(12345678, BigDecimal.valueOf(0.45));
        mbank.openAccount(mbankDebit);

        Account mbankCredit = new CreditAccount(87654321, BigDecimal.valueOf(6), BigDecimal.valueOf(5_000));
        mbank.openAccount(mbankCredit);

        Account mbankDebit2 = new DebitAccount(12345678, BigDecimal.valueOf(0.45));

        try {
            mbank.openAccount(mbankDebit);
        } catch (AccountAlreadyExistsException e) {

        }

    }
}