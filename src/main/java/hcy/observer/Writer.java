package hcy.observer;

import lombok.Getter;

import java.util.Observable;

// 作者类，要继承自被观察者类
public class Writer extends Observable {
    // 作者的名称
    @Getter
    private String name;

    // 记录作者最新发布的小说
    @Getter
    private String lastNovel;

    public Writer(String name) {
        super();
        this.name = name;
        WriterManager.getInstance().add(this);
    }

    //作者发布新小说了，要通知所有关注自己的读者
    public void addNovel(String novel) {
        System.out.println(name + "发布了新书《" + novel + "》！");
        lastNovel = novel;
        setChanged();
        notifyObservers();
    }
}
