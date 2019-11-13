package hcy.factory.normalfactory;

public class Undergraduate implements LeiFeng {
    @Override
    public void sweep() {
        System.out.println("毕业生 扫地");
    }

    @Override
    public void wash() {
        System.out.println("毕业生 洗衣");
    }

    @Override
    public void buyRice() {
        System.out.println("毕业生 买米");
    }
}
