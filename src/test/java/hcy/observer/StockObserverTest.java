package hcy.observer;

import org.junit.Test;

public class StockObserverTest {
    @Test
    public void test() {
        Boss boss = new Boss();

        StockObserver stockObserver = new StockObserver("11", boss);
        NbaObserver nbaObserver = new NbaObserver("22", boss);

        boss.attach(stockObserver);
        boss.attach(nbaObserver);

        boss.detach(stockObserver);

        boss.setSubjectState("boss coming");
        boss.notifyObserver();
    }
}