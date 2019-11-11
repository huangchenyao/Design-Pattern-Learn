package hcy.proxy;

public class StaticProxy implements MyInterface {
    private MyInterface myInterface;

    public StaticProxy(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    @Override
    public String doSomething() {
        System.out.println("static proxy do something");
        return "proxy: " + myInterface.doSomething();
    }
}
