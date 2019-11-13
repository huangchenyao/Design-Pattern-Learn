package hcy.factory;

public class RefrigeratorFactory implements ApplianceFactory {
    @Override
    public Appliance createAppliance() {
        return new Refrigerator();
    }
}
