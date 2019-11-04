package hcy.flyweight;

import org.junit.Test;

public class WebSiteTest {
    @Test
    public void test() {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite fx = factory.getWebSiteCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = factory.getWebSiteCategory("产品展示");
        fy.use(new User("111"));

        WebSite fz = factory.getWebSiteCategory("产品展示");
        fz.use(new User("222"));

        WebSite fl = factory.getWebSiteCategory("博客");
        fl.use(new User("333"));

        WebSite fm = factory.getWebSiteCategory("博客");
        fm.use(new User("444"));

        WebSite fn = factory.getWebSiteCategory("博客");
        fn.use(new User("555"));

        System.out.println(factory.getWebSiteCount());
    }
}
