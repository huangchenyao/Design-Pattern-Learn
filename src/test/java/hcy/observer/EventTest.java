package hcy.observer;

import org.junit.Test;

public class EventTest {
    @Test
    public void test() {
        // 假设四个读者，两个作者
        ReaderNew r1 = new ReaderNew("谢广坤");
        ReaderNew r2 = new ReaderNew("赵四");
        ReaderNew r3 = new ReaderNew("七哥");
        ReaderNew r4 = new ReaderNew("刘能");

        WriterNew w1 = new WriterNew("谢大脚");
        WriterNew w2 = new WriterNew("王小蒙");

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
