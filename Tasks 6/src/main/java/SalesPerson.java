import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private final int rate;

    public SalesPerson(String name, BigDecimal wage, int rate) {
        super(name, wage);
        this.rate = rate;
    }

    @Override
    public void setBonus() {
        if(rate > 200){
            setBonus(getBonus().multiply(new BigDecimal(3)));
        }
        else if(rate > 100){
            setBonus(getBonus().multiply(new BigDecimal(2)));
        }
    }
}