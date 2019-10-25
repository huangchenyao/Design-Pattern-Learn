package hcy.observer;

public class StockObserver extends Observer {

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s，%s关闭股票行情，继续工作", getSubject().getSubjectState(), getName()));
    }
}
