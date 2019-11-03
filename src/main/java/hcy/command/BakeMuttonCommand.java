package hcy.command;

public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
        barbecuer.bakeMutton();
    }

    @Override
    public String toString() {
        return "烤羊肉串";
    }
}
