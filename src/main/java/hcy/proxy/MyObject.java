package hcy.proxy;

public class MyObject implements MyInterface {
    @Override
    public String doSomething() {
        System.out.println("do sth");
        return "do sth";
    }
}
