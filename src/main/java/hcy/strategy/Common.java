package hcy.strategy;

@TotalValidRegion(max = 1000)
public class Common implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice;
    }
}
