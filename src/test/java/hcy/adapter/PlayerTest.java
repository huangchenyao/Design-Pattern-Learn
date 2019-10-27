package hcy.adapter;

import org.junit.Test;

public class PlayerTest {
    @Test
    public void test() {
        Player b = new Forwards("巴蒂尔");
        b.attack();

        Player m = new Guards("麦迪");
        m.attack();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}
