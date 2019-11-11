package hcy.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyObject2Interceptor implements MethodInterceptor {
    private void before() {
        System.out.println("do sth before");
    }

    private void after() {
        System.out.println("do sth after");
    }

    /**
     * @param obj    表示要进行增强的对象
     * @param method 表示拦截的方法
     * @param args   数组表示参数列表，基本数据类型需要传入其包装类型，如int-->Integer、long-Long、double-->Double
     * @param proxy  表示对方法的代理，invokeSuper方法表示对被代理对象方法的调用
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        // 注意这里是调用invokeSuper而不是invoke，否则死循环，proxy.invokeSuper执行的是原始类的方法，proxy.invoke执行的是子类的方法
        Object result = proxy.invokeSuper(obj, args);
        after();
        return result;
    }
}
