package assign7.bank.account;

import java.math.BigDecimal;

public class DebitAccount extends Account {
    public DebitAccount(int accountNumber, BigDecimal percentage) {
        super(accountNumber, percentage);
    }

    @Override
    public void setCreditLimit(BigDecimal creditLimit) throws NoCreditLimitException {
        throw new NoCreditLimitException();
    }

    @Override
    public BigDecimal applyPercentage() {
        //todo: implement the method
        return null;
    }
}
