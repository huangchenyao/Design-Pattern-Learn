package hcy.observer;

import java.util.HashMap;
import java.util.Map;

// 管理器，保持一份独有的作者列表
public class WriterManager {
    private Map<String, Writer> writerMap = new HashMap<>();

    // 单例
    private WriterManager() {
    }

    public static WriterManager getInstance() {
        return WriterManagerInstance.instance;
    }

    // 添加作者
    public void add(Writer writer) {
        writerMap.put(writer.getName(), writer);
    }

    // 根据作者姓名获取作者
    public Writer getWriter(String name) {
        return writerMap.get(name);
    }

    private static class WriterManagerInstance {
        private static WriterManager instance = new WriterManager();
    }
}
