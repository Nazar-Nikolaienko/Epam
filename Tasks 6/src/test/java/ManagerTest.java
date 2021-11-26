import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void setBonusl100() {
        Manager manager = new Manager("Саша", new BigDecimal(17000), 65);
        manager.setBonus(new BigDecimal(1000));
        manager.setBonus();
        assertEquals(new BigDecimal(1000), manager.getBonus());
    }

    @Test
    void setBonusb100() {
        Manager manager = new Manager("Саша", new BigDecimal(17000), 155);
        manager.setBonus(new BigDecimal(1000));
        manager.setBonus();
        assertEquals(new BigDecimal(1500), manager.getBonus());
    }

    @Test
    void setBonusb200() {
        Manager manager = new Manager("Саша", new BigDecimal(17000), 128);
        manager.setBonus(new BigDecimal(1000));
        manager.setBonus();
        assertEquals(new BigDecimal(2000), manager.getBonus());
    }
}