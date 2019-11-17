package hcy.strategy;

@TotalValidRegion(min = 2000, max = 3000)
public class GoldVip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.5;
    }
}
