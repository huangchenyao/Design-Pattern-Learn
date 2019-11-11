package hcy.proxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public void proxy_test() {
        // 原始
        MyInterface obj = new MyObject();
        obj.doSomething();
        System.out.println("==============================");

        // 静态代理
        MyInterface staticProxyObj = new StaticProxy(new MyObject());
        staticProxyObj.doSomething();
        System.out.println("==============================");

        // 动态代理
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        InvocationHandler handler = new DynamicProxy(obj);
        MyInterface dynamicProxyObj = (MyInterface) Proxy.newProxyInstance(classLoader, interfaces, handler);
        dynamicProxyObj.doSomething();
        System.out.println("==============================");

        // cglib代理
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyObject2.class);
        enhancer.setCallback(new MyObject2Interceptor());
        MyObject2 obj2 = (MyObject2) enhancer.create();
        obj2.doSomething();
        System.out.println("==============================");
    }
}
