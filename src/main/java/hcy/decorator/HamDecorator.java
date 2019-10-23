package hcy.decorator;

public class HamDecorator extends PancakeDecorator {
    public HamDecorator(IPancake pancake) {
        super(pancake);
    }

    @Override
    public void cook() {
        System.out.println("加了一根火腿，");
        super.cook();
    }
}
