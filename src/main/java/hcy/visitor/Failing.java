package hcy.visitor;

public class Failing extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("男人%s时，背后多半有一个伟大的女人。", man.getAction()));
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(String.format("女人%s时，背后多半有一个不成功的男人。", woman.getAction()));
    }
}
