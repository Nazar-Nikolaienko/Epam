import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void Bonus() {
        SalesPerson person1 = new SalesPerson("Саша", new BigDecimal(14_000), 150);
        SalesPerson person2 = new SalesPerson("Маша", new BigDecimal(19_000), 210);
        Manager person3 = new Manager("Вася", new BigDecimal(35_000), 120);

        Company company = new Company(new Employee[]{
                person1,
                person2,
                person3,
        });

        company.Bonus(new BigDecimal(1000));
        assertEquals(new BigDecimal(1000), person1.getBonus());
        assertEquals(new BigDecimal(1000), person2.getBonus());
        assertEquals(new BigDecimal(1000), person3.getBonus());

    }

    @Test
    void Pay() {
        SalesPerson person1 = new SalesPerson("Саша", new BigDecimal(10_000), 120);
        SalesPerson person2 = new SalesPerson("Маша", new BigDecimal(15_000), 260);
        Manager person3 = new Manager("Вася", new BigDecimal(25_000), 160);


        Company company = new Company(new Employee[]{
                person1,
                person2,
                person3,

        });

        assertEquals(person1.toPay().add(person2.toPay()).add(person3.toPay()), company.Pay());

        company.Bonus(new BigDecimal(1000));

        assertEquals(person1.toPay().add(person2.toPay()).add(person3.toPay()), company.Pay());
    }

    @Test
    void Wage() {
        SalesPerson person1 = new SalesPerson("Саша", new BigDecimal(10_000), 120);
        SalesPerson person2 = new SalesPerson("Маша", new BigDecimal(15_000), 260);
        Manager person3 = new Manager("Вася", new BigDecimal(25_000), 160);

        Company company = new Company(new Employee[]{
                person1,
                person2,
                person3,
        });

        String name = company.Salary();
        assertEquals(person3.getName(), name);
    }
}