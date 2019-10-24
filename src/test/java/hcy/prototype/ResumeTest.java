package hcy.prototype;

import org.junit.Test;

public class ResumeTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Resume a = new Resume("clearlove");
        a.setPersonalInfo("男", "25");
        a.setWorkExperience("1998-2000", "xx");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2006", "yy");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("man", "21");
        c.setWorkExperience("1998-2016", "zz");

        a.display();
        b.display();
        c.display();
    }
}
