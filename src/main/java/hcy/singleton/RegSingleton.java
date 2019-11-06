package hcy.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RegSingleton {
    // 通过 Map 实现单例注册表
    private final static Map<String, Object> singletonObjects = new ConcurrentHashMap<>(16);

    public static Object getSingleton(String className) {
        assert className != null;
        synchronized (singletonObjects) {
            // 检查缓存中是否存在实例
            if (singletonObjects.get(className) == null) {
                try {
                    // 如果实例对象在不存在，注册到单例注册表中
                    singletonObjects.put(className, Class.forName(className).getConstructor().newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return singletonObjects.get(className);
        }
    }
}
