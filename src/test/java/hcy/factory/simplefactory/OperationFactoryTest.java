package hcy.factory.simplefactory;

import org.junit.Assert;
import org.junit.Test;

public class OperationFactoryTest {
    @Test
    public void test_add_operate() {
        Operation operation = OperationFactory.createOperate("+");
        operation.setNumberA(1d);
        operation.setNumberB(2d);
        Assert.assertEquals(1d + 2d, operation.getResult(), 0);
    }

    @Test
    public void test_div_operate() {
        Operation operation = OperationFactory.createOperate("/");
        operation.setNumberA(1d);
        operation.setNumberB(3d);
        Assert.assertEquals(1d / 3d, operation.getResult(), 0);
    }
}
