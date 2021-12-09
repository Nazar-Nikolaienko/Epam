import java.math.BigDecimal;
import java.math.RoundingMode;


public abstract class Deposit {
    public BigDecimal depositAmount;
    public int period;


    public BigDecimal getDepositAmount() {
        return depositAmount.setScale(2, RoundingMode.HALF_UP);
    }
    public int getPeriod() {
        return period;
    }

    public Deposit(BigDecimal depositAmount, int period) {
        this.depositAmount = depositAmount;
        this.period = period;
    }

    public Deposit(double depositAmount, int period) {
        this(BigDecimal.valueOf(depositAmount),period);
    }

    abstract BigDecimal inc();
}