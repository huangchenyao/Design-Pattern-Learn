package hcy.factory;

import org.junit.Test;

public class ApplianceFactoryTest {
    @Test
    public void simple_factory() {
        ApplianceSimpleFactory.createAppliance("refrigerator").work();
        ApplianceSimpleFactory.createAppliance("television").work();
    }

    @Test
    public void factory() {
        ApplianceFactory factory;

        factory = new RefrigeratorFactory();
        factory.createAppliance().work();

        factory = new TelevisionFactory();
        factory.createAppliance().work();
    }

    @Test
    public void abstract_factory() {
        ApplianceAbstractFactory factory;

        factory = new MeideApplianceFactory();
        factory.createRefrigerator().work();
        factory.createTelevision().work();

        factory = new HaierApplianceFactory();
        factory.createRefrigerator().work();
        factory.createTelevision().work();
    }
}
