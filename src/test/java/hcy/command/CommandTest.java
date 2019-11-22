package hcy.command;

import org.junit.Test;

public class CommandTest {
    @Test
    public void test() {
        TVController controller = new TVController(new TV());
        controller.on();
        controller.off();
    }
}
