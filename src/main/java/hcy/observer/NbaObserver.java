package hcy.observer;

public class NbaObserver extends Observer {

    public NbaObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s，%s关闭Nba，继续工作", getSubject().getSubjectState(), getName()));
    }
}
