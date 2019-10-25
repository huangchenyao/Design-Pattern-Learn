package hcy.factory.simplefactory;

public class OperationAdd extends Operation {
    @Override
    double getResult() {
        return getNumberA() + getNumberB();
    }
}
