package hcy.template;

import org.junit.Test;

public class MyPageBuilderTest {
    @Test
    public void test() {
        PageBuilder pageBuilder = new MyPageBuilder();
        System.out.println(pageBuilder.buildHtml());
    }
}
