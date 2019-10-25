package hcy.state;

public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isTaskFinish()) {
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println(String.format("当前时间：%.2f，加班，疲惫至极", work.getHour()));
            } else {
                work.setState(new SleepState());
                work.writeProgram();
            }
        }
    }
}
