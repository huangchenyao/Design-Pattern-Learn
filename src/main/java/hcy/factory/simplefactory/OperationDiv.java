package hcy.factory.simplefactory;

public class OperationDiv extends Operation {
    @Override
    double getResult() {
        if (getNumberB() == 0) {
            throw new RuntimeException("除数不能为0。");
        }
        return getNumberA() / getNumberB();
    }
}
