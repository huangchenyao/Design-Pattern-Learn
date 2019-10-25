package hcy.state;

public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%.2f，下班回家了", work.getHour()));
    }
}
