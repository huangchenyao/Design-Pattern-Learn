package hcy.decorator;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void test() {
        Component component = new ConcreteComponent(); // 原来的对象
        component.method(); // 原来的方法
        System.out.println("------------------------------");

        component = new ConcreteDecoratorA(component); // 装饰成A
        component.method(); // 原来的方法
        ((ConcreteDecoratorA) component).methodA(); // 装饰成A以后新增的方法
        System.out.println("------------------------------");

        component = new ConcreteDecoratorB(component); // 再装饰成B
        component.method(); // 原来的方法
        ((ConcreteDecoratorB) component).methodB(); // 装饰成B以后新增的方法
        System.out.println("------------------------------");
    }
}
