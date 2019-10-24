package hcy.template;

public abstract class TestPaper {
    public void testQuestion1() {
        System.out.println("问题1");
        System.out.println("答案：" + answer1());
    }

    public void testQuestion2() {
        System.out.println("问题2");
        System.out.println("答案：" + answer2());
    }

    public void testQuestion3() {
        System.out.println("问题3");
        System.out.println("答案：" + answer3());
    }

    abstract String answer1();

    abstract String answer2();

    abstract String answer3();
}
