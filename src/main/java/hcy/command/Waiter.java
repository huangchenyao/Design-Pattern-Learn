package hcy.command;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        if ("烤鸡翅".equals(command.toString())) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        } else {
            orders.add(command);
            System.out.println("增加订单：" + command.toString() + " 时间：" + LocalDateTime.now());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单：" + command.toString() + " 时间：" + LocalDateTime.now());
    }

    public void notifys() {
        orders.forEach(Command::excuteCommand);
    }
}
