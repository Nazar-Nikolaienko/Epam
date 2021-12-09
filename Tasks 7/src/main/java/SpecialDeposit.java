import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit {

    public SpecialDeposit(BigDecimal depositAmount, int period) {
        super(depositAmount, period);
    }
    public SpecialDeposit(double depositAmount, int period) {
        super(depositAmount,period);
    }

    @Override
    public BigDecimal inc() {
        BigDecimal currentDeposit ;
        BigDecimal sumDeposit = BigDecimal.valueOf(0);
        BigDecimal currentDepositAmount = this.getDepositAmount();

        for(int i=1;i<= this.getPeriod();i++) {

            currentDeposit = currentDepositAmount.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(i));
            currentDepositAmount = currentDepositAmount.add(currentDeposit);
            sumDeposit=sumDeposit.add(currentDeposit);
        }
        return sumDeposit.setScale(2, RoundingMode.DOWN);
    }

}