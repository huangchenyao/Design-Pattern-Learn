package hcy.iterator;

import org.junit.Test;

public class IteratorTest {
    @Test
    public void test() {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.setValue(0, "大鸟");
        aggregate.setValue(1, "小菜");
        aggregate.setValue(2, "行李");
        aggregate.setValue(3, "老外");
        aggregate.setValue(4, "公交内部员工");
        aggregate.setValue(5, "小偷");

        Iterator i = new ConcreteIterator(aggregate);
        Object item = i.first();
        while (!i.isDone()) {
            System.out.println(i.currentItem() + "请买车票");
            i.next();
        }

        System.out.println();

        Iterator iDesc = new ConcreteIteratorDesc(aggregate);
        while (!iDesc.isDone()) {
            System.out.println(iDesc.currentItem() + "请买车票");
            iDesc.next();
        }
    }
}
