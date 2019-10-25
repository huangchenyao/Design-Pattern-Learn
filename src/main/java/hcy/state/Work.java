package hcy.state;

import lombok.Getter;
import lombok.Setter;

public class Work {
    private State current;
    @Getter
    @Setter
    private double hour;
    @Getter
    @Setter
    private boolean taskFinish = false;

    // 工作状态初始化为早上
    public Work() {
        current = new ForenoonState();
    }

    public void writeProgram() {
        current.writeProgram(this);
    }

    public void setState(State state) {
        this.current = state;
    }
}
