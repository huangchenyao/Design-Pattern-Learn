package hcy.observer;

import lombok.Getter;
import lombok.Setter;

public abstract class Subject {
    @Getter
    @Setter
    private String subjectState;

    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void notifyObserver();
}
