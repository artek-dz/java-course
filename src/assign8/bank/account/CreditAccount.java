package assign8.bank.account;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    public CreditAccount(int accountNumber, BigDecimal percentage, BigDecimal creditLimit) {
        super(accountNumber, percentage, creditLimit);
    }



    @Override
    public BigDecimal applyPercentage() {
        //TODO: implement the method
        return null;
    }
}
