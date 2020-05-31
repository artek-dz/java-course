package assign8.account1;

import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class TransactionLogItem {
    private LocalDateTime dateTime;
    private String message;
    private BigDecimal oldBalance;
    private BigDecimal newBalance;

    public TransactionLogItem(LocalDateTime dateTime, String message,
                              BigDecimal oldBalance, BigDecimal newBalance) {
        this.dateTime = dateTime;
        this.message = message;
        this.oldBalance = oldBalance;
        this.newBalance = newBalance;
    }

    @Override
    public String toString() {
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")) + ": " + message +
                ", old balance = " + oldBalance +
                ", new balance = " + newBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionLogItem transactionLogItem = (TransactionLogItem) o;
        return Objects.equals(dateTime, transactionLogItem.dateTime) &&
                Objects.equals(message, transactionLogItem.message) &&
                Objects.equals(oldBalance, transactionLogItem.oldBalance) &&
                Objects.equals(newBalance, transactionLogItem.newBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, message, oldBalance, newBalance);
    }
}
