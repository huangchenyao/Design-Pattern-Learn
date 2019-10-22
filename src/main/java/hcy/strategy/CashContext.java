package hcy.strategy;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type) {
            case "Normal":
                cashSuper = new CashNormal();
                break;
            case "打八折":
                cashSuper = new CashRebate(0.8d);
                break;
            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
            default:
                cashSuper = new CashNormal();
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
