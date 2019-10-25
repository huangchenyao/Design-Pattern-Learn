package hcy.factory.normalfactory;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void createLeiFeng() {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.buyRice();
        student.sweep();
        student.wash();
    }
}
