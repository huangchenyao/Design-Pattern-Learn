package hcy.factory.simplefactory;

public class OperationSub extends Operation {
    @Override
    double getResult() {
        return getNumberA() - getNumberB();
    }
}
