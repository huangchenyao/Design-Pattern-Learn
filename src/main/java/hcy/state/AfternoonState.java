package hcy.state;

public class AfternoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println(String.format("当前时间：%.2f，下午状态还不错，继续努力", work.getHour()));
        } else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
