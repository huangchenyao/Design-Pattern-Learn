package hcy.strategy;

@TotalValidRegion(min = 3000)
public class SuperVip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.7;
    }
}
