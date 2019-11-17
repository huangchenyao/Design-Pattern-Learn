package hcy.strategy;

@TotalValidRegion(min = 1000, max = 2000)
public class Vip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }
}
