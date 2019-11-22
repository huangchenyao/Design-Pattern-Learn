package hcy.command;

public class TVOffCommand implements TVCommand {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("turn off television");
        tv.off();
    }
}
