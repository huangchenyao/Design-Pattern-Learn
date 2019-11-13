package hcy.factory;

// 美的工厂
public class MeideApplianceFactory extends ApplianceAbstractFactory {
    @Override
    public Refrigerator createRefrigerator() {
        return new MeideRefrigerator();
    }

    @Override
    public Television createTelevision() {
        return new MeideTelevision();
    }
}
