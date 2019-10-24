package hcy.proxy;

public class Pursuit implements GiveGift {
    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println(schoolGirl.getName() + "送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(schoolGirl.getName() + "送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(schoolGirl.getName() + "送你巧克力");
    }
}
