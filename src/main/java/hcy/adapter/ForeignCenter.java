package hcy.adapter;

import lombok.Getter;
import lombok.Setter;

public class ForeignCenter {
    @Getter
    @Setter
    private String name;

    public void 进攻() {
        System.out.println("外籍中锋" + name + "进攻");
    }

    public void 防守() {
        System.out.println("外籍中锋" + name + "防守");
    }
}
