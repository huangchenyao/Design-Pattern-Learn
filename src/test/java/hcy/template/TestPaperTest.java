package hcy.template;

import org.junit.Test;

public class TestPaperTest {
    @Test
    public void test() {
        System.out.println("student A");
        TestPaper studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        TestPaper studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }

}