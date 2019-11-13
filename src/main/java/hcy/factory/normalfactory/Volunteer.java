package hcy.factory.normalfactory;

public class Volunteer implements LeiFeng {
    @Override
    public void sweep() {
        System.out.println("志愿者 扫地");
    }

    @Override
    public void wash() {
        System.out.println("志愿者 洗衣");
    }

    @Override
    public void buyRice() {
        System.out.println("志愿者 买米");
    }
}
