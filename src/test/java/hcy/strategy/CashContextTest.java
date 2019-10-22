package hcy.strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashContextTest {

    @Test
    public void getResult() {
        double res;

        res = new CashContext("normal").getResult(77.77d);
        assertEquals(77.77d, res, 0);

        res = new CashContext("打八折").getResult(66.66d);
        assertEquals(66.66d * 0.8d, res, 0);
    }
}