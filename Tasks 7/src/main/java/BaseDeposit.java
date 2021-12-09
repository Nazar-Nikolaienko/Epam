import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit {

    public BaseDeposit(double depositAmount, int period) {
        super(depositAmount,period);
    }

    @Override
    BigDecimal inc() {
        BigDecimal currentDeposit;
        BigDecimal sumDeposit = BigDecimal.valueOf(0);
        BigDecimal currentDepositAmount = this.getDepositAmount();

        for(int i=1;i<= this.getPeriod();i++) {
            currentDeposit = currentDepositAmount.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(5));
            currentDepositAmount = currentDepositAmount.add(currentDeposit);
            sumDeposit=sumDeposit.add(currentDeposit);
        }
        //currentDeposit=this.getDepositAmount().subtract(currentDeposit);
        return sumDeposit.setScale(2, RoundingMode.DOWN);
    }
}