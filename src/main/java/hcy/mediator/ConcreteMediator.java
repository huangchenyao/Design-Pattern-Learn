package hcy.mediator;

import lombok.Setter;

public class ConcreteMediator extends Mediator {
    @Setter
    private ConcreteColleague1 colleague1;
    @Setter
    private ConcreteColleague2 colleague2;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.notifys(message);
        } else {
            colleague1.notifys(message);
        }
    }
}
