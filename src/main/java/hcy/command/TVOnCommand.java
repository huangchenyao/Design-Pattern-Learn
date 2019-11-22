package hcy.command;

public class TVOnCommand implements TVCommand {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("turn on television");
        tv.on();
    }
}
