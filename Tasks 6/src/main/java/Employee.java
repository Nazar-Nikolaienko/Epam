import java.math.BigDecimal;

public abstract class Employee {
    private BigDecimal wage;
    private String name;
    private BigDecimal bonus;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return wage;
    }

    public void setSalary(BigDecimal salary) {
        this.wage = salary;
    }

    public Employee(String name, BigDecimal wage) {
        setName(name);
        setSalary(wage);
        setBonus(new BigDecimal(0));
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus){
        this.bonus = bonus;
    }

    abstract void setBonus();

    public BigDecimal toPay(){
        return getSalary().add(bonus);
    }
}