package hcy.simplefactory;

import lombok.Data;

@Data
public abstract class Operation {
    private double numberA;
    private double numberB;

    abstract double getResult();
}
