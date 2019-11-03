package hcy.command;

import org.junit.Test;

public class CommandTest {
    @Test
    public void test() {
        Barbecuer barbecuer = new Barbecuer();
        Command command1 = new BakeMuttonCommand(barbecuer);
        Command command2 = new BakeMuttonCommand(barbecuer);
        Command command3 = new BakeChickenWingCommand(barbecuer);
        Waiter waiter = new Waiter();

        waiter.setOrder(command1);
        waiter.setOrder(command2);
        waiter.setOrder(command3);
        waiter.notifys();
    }
}
