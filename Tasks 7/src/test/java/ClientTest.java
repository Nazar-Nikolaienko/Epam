import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClientTest {


    @Test
    public void testClientD() {
        Client client = new Client();
        Deposit baseDeposit = new BaseDeposit(1000,3);
        Deposit baseDeposit1 = new BaseDeposit(1000,2);
        client.addDeposit(baseDeposit);
        client.addDeposit(baseDeposit1);

        assertEquals("Error!",
                BigDecimal.valueOf(157.62).setScale(2,RoundingMode.HALF_UP), client.getIncomeByNumber(1));

        assertEquals("Error!",
                BigDecimal.valueOf(102.50).setScale(2,RoundingMode.HALF_UP), client.getIncomeByNumber(2));

        assertEquals("Error!",
                BigDecimal.valueOf(0).setScale(2,RoundingMode.HALF_UP), client.getIncomeByNumber(3));
    }

    @Test
    public void testClientI() {
        Client client = new Client();
        Deposit baseDeposit = new BaseDeposit(1000,3);
        Deposit baseDeposit1 = new BaseDeposit(1000,2);

        client.addDeposit(baseDeposit);
        assertEquals("Error!",
                BigDecimal.valueOf(157.62).setScale(2,RoundingMode.HALF_UP), client.maxIncome());

        client.addDeposit(baseDeposit1);
        assertEquals("Error!",
                BigDecimal.valueOf(157.62).setScale(2,RoundingMode.HALF_UP), client.maxIncome());
    }

    @Test
    public void testClientTI() {
        Client client = new Client();
        Deposit baseDeposit = new BaseDeposit(1000,3);
        Deposit baseDeposit1 = new BaseDeposit(1000,2);

        client.addDeposit(baseDeposit);
        client.addDeposit(baseDeposit1);

        BigDecimal totalIncome=client.totalIncome();

        assertEquals("Error! ",
                BigDecimal.valueOf(260.12).setScale(2,RoundingMode.HALF_UP), totalIncome);

    }
}
