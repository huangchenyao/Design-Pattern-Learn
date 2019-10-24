package hcy.prototype;

import lombok.Data;

@Data
public class WorkExperience implements Cloneable {
    private String timeArea;
    private String company;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
