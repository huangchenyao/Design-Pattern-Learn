package hcy.command;

public class TVController {
    private TV tv;

    public TVController(TV tv) {
        this.tv = tv;
    }

    public void on() {
        new TVOnCommand(tv).execute();
    }

    public void off() {
        new TVOffCommand(tv).execute();
    }
}
