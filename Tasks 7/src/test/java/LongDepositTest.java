import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;

class longDepositTest {

    @Test
    public void testClientD() {
        LongDeposit longDeposit = new LongDeposit(1000, 6);
        LongDeposit longDeposit1 = new LongDeposit(1000, 7);
        LongDeposit longDeposit2 = new LongDeposit(1000, 8);

        assertEquals("Error!",
                BigDecimal.valueOf(0).setScale(2, RoundingMode.HALF_UP), longDeposit.inc());

        assertEquals("Error!",
                BigDecimal.valueOf(150).setScale(2, RoundingMode.HALF_UP), longDeposit1.inc());

        assertEquals("Error!",
                BigDecimal.valueOf(322.50).setScale(2, RoundingMode.HALF_UP), longDeposit2.inc());
    }
}