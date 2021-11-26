import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SalesPersonTest {

    @Test
    void setBonusl100() {
        SalesPerson person = new SalesPerson("Саша", new BigDecimal(17000), 35);
        person.setBonus(new BigDecimal(1000));
        person.setBonus();
        assertEquals(new BigDecimal(1000), person.getBonus());
    }

    @Test
    void setBonusb100() {
        SalesPerson person = new SalesPerson("Саша", new BigDecimal(17000), 60);
        person.setBonus(new BigDecimal(1000));
        person.setBonus();
        assertEquals(new BigDecimal(2000), person.getBonus());
    }

    @Test
    void setBonusb200() {
        SalesPerson person = new SalesPerson("Саша", new BigDecimal(17000), 270);
        person.setBonus(new BigDecimal(1000));
        person.setBonus();
        assertEquals(new BigDecimal(3000), person.getBonus());
    }

    @Test
    void setBonus() {
    }
}