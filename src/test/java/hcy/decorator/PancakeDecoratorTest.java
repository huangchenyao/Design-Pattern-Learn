package hcy.decorator;

import org.junit.Test;

public class PancakeDecoratorTest {

    @Test
    public void cook() {
        IPancake pancake = new Pancake();
        EggDecorator eggPancake = new EggDecorator(pancake);
        HamDecorator hamPancake = new HamDecorator(eggPancake);
        LettuceDecorator lettucePancake = new LettuceDecorator(hamPancake);

        lettucePancake.cook();
    }
}