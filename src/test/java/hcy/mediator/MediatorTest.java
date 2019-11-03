package hcy.mediator;

import org.junit.Test;

public class MediatorTest {
    @Test
    public void test() {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("吃过饭了吗？");
        colleague2.send("没有呢，你打算请客？");
    }

    @Test
    public void test2() {
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();
        USA usa = new USA(UNSC);
        Iraq iraq = new Iraq(UNSC);

        UNSC.setColleague1(usa);
        UNSC.setColleague2(iraq);

        usa.declare("不准研制核武器，否则要发动战争！");
        iraq.declare("我们没有核武器，也不怕侵略。");
    }
}