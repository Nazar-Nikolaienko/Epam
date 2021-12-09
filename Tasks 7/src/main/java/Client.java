import java.math.BigDecimal;
import java.math.RoundingMode;


public class Client {
    Deposit[] deposits;

    public Client() {
        this.deposits = new Deposit[10];
    }

    public boolean addDeposit(Deposit deposit) {
        for (int i = 0; i < this.deposits.length; i++)
            if (this.deposits[i] == null) {
                this.deposits[i] = deposit;
                return true;
            }
        return false;
    }

    public BigDecimal totalIncome() {
        BigDecimal totalIncome = BigDecimal.valueOf(0);
        try {
            for (var obj : this.deposits) {
                totalIncome = totalIncome.add(obj.inc());
            }

        } catch (Exception ex) {
        }
        return totalIncome.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal maxIncome() {
        BigDecimal maxIncome = BigDecimal.valueOf(0);
        try {
            for (var obj : this.deposits) {
                if (maxIncome.compareTo(obj.inc()) < 0)
                    maxIncome = (obj.inc());
            }
        } catch (Exception ex) {
        }
        return maxIncome.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal getIncomeByNumber(int num) {
        BigDecimal income = BigDecimal.valueOf(0);
        try {
            income = deposits[--num].inc();
        } catch (Exception ex) {
        }
        return income.setScale(2, RoundingMode.DOWN);
    }

}