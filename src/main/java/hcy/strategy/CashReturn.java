package hcy.strategy;

public class CashReturn extends CashSuper {
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
