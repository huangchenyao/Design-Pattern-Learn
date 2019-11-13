package hcy.factory;

// 海尔工厂
public class HaierApplianceFactory extends ApplianceAbstractFactory {
    @Override
    public Refrigerator createRefrigerator() {
        return new HaierRefrigerator();
    }

    @Override
    public Television createTelevision() {
        return new HaierTelevision();
    }
}
