package hcy.factory.simplefactory;

public class OperationFactory {
    public static Operation createOperate(String operate) {
        switch (operate) {
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
            default:
                throw new IllegalStateException("Unexpected value: " + operate);
        }
    }
}
