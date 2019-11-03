package hcy.bridge;

import org.junit.Test;

public class HandsetSoftTest {
    @Test
    public void test() {
        HandsetBrand handsetBrand;

        handsetBrand = new HandsetBrandN();

        handsetBrand.setHandsetSoft(new HandsetGame());
        handsetBrand.run();

        handsetBrand.setHandsetSoft(new HandsetAddressList());
        handsetBrand.run();

        handsetBrand = new HandsetBrandM();

        handsetBrand.setHandsetSoft(new HandsetGame());
        handsetBrand.run();

        handsetBrand.setHandsetSoft(new HandsetAddressList());
        handsetBrand.run();
    }
}
