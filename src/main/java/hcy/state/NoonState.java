package hcy.state;

public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println(String.format("当前时间：%.2f，饿了，午饭，犯困，午休", work.getHour()));
        } else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
