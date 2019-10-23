package hcy.decorator;

public class LettuceDecorator extends PancakeDecorator {
    public LettuceDecorator(IPancake pancake) {
        super(pancake);
    }

    @Override
    public void cook() {
        System.out.println("加了一颗生菜，");
        super.cook();
    }
}
