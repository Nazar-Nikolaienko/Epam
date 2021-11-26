import java.math.BigDecimal;

public class Company {
    private Employee[] s;

    public Company(Employee[] staff) {
        this.s = staff;
    }

    public void Bonus(BigDecimal money) {
        for (Employee employee : s) {
            employee.setBonus(money);
        }
    }

    public BigDecimal Pay() {
        BigDecimal all = new BigDecimal(0);

        for (Employee employee : s) {
            all = all.add(employee.toPay());
        }

        return all;
    }

    public String Salary() {
        String name = s[0].getName();
        BigDecimal maxSalary = s[0].toPay();

        for (Employee employee : s) {
            maxSalary = maxSalary.max(employee.toPay());
            if (maxSalary.equals(employee.toPay())) {
                name = employee.getName();
            }
        }

        return name;
    }
}
