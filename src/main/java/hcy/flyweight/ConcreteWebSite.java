package hcy.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConcreteWebSite extends WebSite {
    private String name;

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + " 用户：" + user.getName());
    }
}
