package hcy.simplefactory;

public class OperationMul extends Operation {
    @Override
    double getResult() {
        return getNumberA() * getNumberB();
    }
}
