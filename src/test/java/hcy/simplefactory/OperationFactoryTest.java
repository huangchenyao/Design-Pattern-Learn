package hcy.simplefactory;

import org.junit.Assert;
import org.junit.Test;

public class OperationFactoryTest {
    @Test
    public void test_add_operate() {
        Operation operation = OperationFactory.createOperate("+");
        operation.setNumberA(1f);
        operation.setNumberB(2f);
        Assert.assertEquals(1f + 2f, operation.getResult(), 0);
    }

    @Test
    public void test_div_operate() {
        Operation operation = OperationFactory.createOperate("/");
        operation.setNumberA(1f);
        operation.setNumberB(3f);
        Assert.assertEquals(1f / 3f, operation.getResult(), 0.00001);
    }
}
