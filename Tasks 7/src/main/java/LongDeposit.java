import java.math.BigDecimal;
import java.math.RoundingMode;

public class LongDeposit extends Deposit {

    public LongDeposit(BigDecimal depositAmount, int period) {
        super(depositAmount, period);
    }
    public LongDeposit(double depositAmount, int period) {
        super(depositAmount, period);
    }

    @Override
    public BigDecimal inc() {
        BigDecimal currentDeposit;
        BigDecimal sumDeposit = BigDecimal.valueOf(0);
        BigDecimal currentDepositAmount = this.getDepositAmount();

        if (this.getPeriod() >= 7)
            for (int i = 7; i <= this.getPeriod(); i++) {
                currentDeposit = currentDepositAmount.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(15));
                currentDepositAmount = currentDepositAmount.add(currentDeposit);
                sumDeposit=sumDeposit.add(currentDeposit);
            }
        return sumDeposit.setScale(2, RoundingMode.DOWN);
    }

}