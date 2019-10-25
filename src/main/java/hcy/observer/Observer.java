package hcy.observer;

import lombok.Getter;

public abstract class Observer {
    @Getter
    private String name;
    @Getter
    private Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
