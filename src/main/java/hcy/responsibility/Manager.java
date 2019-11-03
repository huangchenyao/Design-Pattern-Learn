package hcy.responsibility;

import lombok.Setter;

public abstract class Manager {
    protected String name;
    @Setter
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public abstract void requestApplications(Request request);
}
