package hcy.visitor;

import lombok.Getter;
import lombok.Setter;

public abstract class Person {
    @Getter
    @Setter
    protected String action;

    public abstract void accept(Action visitor);
}
