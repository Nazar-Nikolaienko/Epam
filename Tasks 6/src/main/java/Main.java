import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(new Employee[]{
                new SalesPerson("Саша",
                        new BigDecimal(2000), 20),

                new SalesPerson("Маша",
                        new BigDecimal(5500), 95),

                new Manager("Вася",
                        new BigDecimal(3500), 40)
        });
        company.Bonus(new BigDecimal(500));

        System.out.println("Max зарплата у: " + company.Salary());

        System.out.println(company.Pay());
    }
}
