package hcy.factory;

public class TelevisionFactory implements ApplianceFactory {
    @Override
    public Appliance createAppliance() {
        return new Television();
    }
}
