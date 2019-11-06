package hcy.singleton;

//饿汉模式，很饿很着急，所以类加载时即创建实例对象
public class HungarySingleton {
    private static HungarySingleton singleton = new HungarySingleton();

    private HungarySingleton() {
    }

    public static HungarySingleton getInstance() {
        return singleton;
    }
}
