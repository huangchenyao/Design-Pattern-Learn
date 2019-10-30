package hcy.memento;

import lombok.Getter;
import lombok.Setter;

public class Originator {
    @Getter
    @Setter
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println("State=" + state);
    }
}
