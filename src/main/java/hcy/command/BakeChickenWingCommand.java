package hcy.command;

public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
        barbecuer.bakeChickenWing();
    }

    @Override
    public String toString() {
        return "烤鸡翅";
    }
}
