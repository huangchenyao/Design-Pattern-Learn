package hcy.proxy;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void test() {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("777");

        Proxy proxy = new Proxy(schoolGirl);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}