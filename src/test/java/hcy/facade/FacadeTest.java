package hcy.facade;

import org.junit.Test;

public class FacadeTest {
    @Test
    public void test() {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}