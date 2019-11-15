package hcy.observer;

import lombok.Getter;

public class ReaderNew implements WriterListener {
    @Getter
    private String name;

    public ReaderNew(String name) {
        super();
        this.name = name;
    }

    //读者可以关注某一位作者，关注则代表把自己加到作者的监听器列表里
    public void subscribe(String writerName) {
        WriterNewManager.getInstance().getWriter(writerName).registerListener(this);
    }

    //读者可以取消关注某一位作者，取消关注则代表把自己从作者的监听器列表里注销
    public void unsubscribe(String writerName) {
        WriterNewManager.getInstance().getWriter(writerName).unregisterListener(this);
    }

    public void addNovel(WriterEvent writerEvent) {
        WriterNew writer = writerEvent.getWriter();
        System.out.println("listen, " + name + "知道" + writer.getName() + "发布了新书《" + writer.getLastNovel() + "》，非要去看！");
    }
}
