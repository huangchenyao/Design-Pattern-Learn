package hcy.observer;

import java.util.HashMap;
import java.util.Map;

// 管理器，保持一份独有的作者列表
public class WriterNewManager {
    private Map<String, WriterNew> writerMap = new HashMap<>();

    // 单例
    private WriterNewManager() {
    }

    public static WriterNewManager getInstance() {
        return WriterManagerInstance.instance;
    }

    // 添加作者
    public void add(WriterNew writer) {
        writerMap.put(writer.getName(), writer);
    }

    // 根据作者姓名获取作者
    public WriterNew getWriter(String name) {
        return writerMap.get(name);
    }

    private static class WriterManagerInstance {
        private static WriterNewManager instance = new WriterNewManager();
    }
}
