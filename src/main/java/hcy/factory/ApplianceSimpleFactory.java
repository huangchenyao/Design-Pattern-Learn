package hcy.factory;

public class ApplianceSimpleFactory {
    public static Appliance createAppliance(String type) {
        switch (type) {
            case "refrigerator":
                return new Refrigerator();
            case "television":
                return new Television();
            default:
                throw new RuntimeException();
        }
    }
}
