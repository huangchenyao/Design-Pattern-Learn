package hcy.state;

public class SleepState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%.2f，不行了，睡着了", work.getHour()));
    }
}
