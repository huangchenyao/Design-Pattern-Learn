package hcy.visitor;

import org.junit.Test;

public class VisitorTest {
    @Test
    public void test() {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        Success v1 = new Success();
        o.display(v1);
    }
}
