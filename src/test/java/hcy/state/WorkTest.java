package hcy.state;

import org.junit.Test;

public class WorkTest {
    @Test
    public void test() {
        Work emergencyProjects = new Work();
        for (int i = 9; i < 23; ++i) {
            if (i == 17) {
                emergencyProjects.setTaskFinish(true);
            }
            emergencyProjects.setHour(i);
            emergencyProjects.writeProgram();
        }
    }
}
