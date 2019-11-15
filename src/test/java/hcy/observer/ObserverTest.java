package hcy.observer;

import org.junit.Test;

public class ObserverTest {
    @Test
    public void test() {
        // 假设四个读者，两个作者
        Reader r1 = new Reader("谢广坤");
        Reader r2 = new Reader("赵四");
        Reader r3 = new Reader("七哥");
        Reader r4 = new Reader("刘能");

        Writer w1 = new Writer("谢大脚");
        Writer w2 = new Writer("王小蒙");

        // 四人关注了谢大脚
        r1.subscribe("谢大脚");
        r2.subscribe("谢大脚");
        r3.subscribe("谢大脚");
        r4.subscribe("谢大脚");

        // 七哥和刘能还关注了王小蒙
        r3.subscribe("王小蒙");
        r4.subscribe("王小蒙");

        // 作者发布新书就会通知关注的读者
        // 谢大脚写了设计模式
        w1.addNovel("设计模式");
        // 王小蒙写了JAVA编程思想
        w2.addNovel("JAVA编程思想");
        // 谢广坤取消关注谢大脚
        r1.unsubscribe("谢大脚");
        // 谢大脚再写书将不会通知谢广坤
        w1.addNovel("观察者模式");
    }
}
