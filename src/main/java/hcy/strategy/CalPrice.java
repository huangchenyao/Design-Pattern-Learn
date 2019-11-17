package hcy.strategy;

public interface CalPrice {
    // 根据原价返回一个最终的价格
    Double calPrice(Double originalPrice);
}
