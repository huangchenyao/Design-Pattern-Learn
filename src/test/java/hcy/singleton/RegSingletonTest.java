package hcy.singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RegSingletonTest {
    private volatile boolean lock;

    public static void main(String[] args) throws InterruptedException {
        final Set<String> instanceSet = Collections.synchronizedSet(new HashSet<>());
        final RegSingletonTest lock = new RegSingletonTest();
        lock.setLock(true);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> {
                while (true) {
                    if (!lock.isLock()) {
                        Object object = RegSingleton.getSingleton(ClassA.class.getName());
                        Singleton singleton = Singleton.getInstance();
                        instanceSet.add(object.toString());
                        instanceSet.add(singleton.toString());
                        break;
                    }
                }
            });
        }
        Thread.sleep(1000);
        lock.setLock(false);
        Thread.sleep(1000);
        System.out.println("------并发情况下我们取到的实例------");
        for (String instance : instanceSet) {
            System.out.println(instance);
        }
        executorService.shutdown();
    }

    private boolean isLock() {
        return lock;
    }

    private void setLock(boolean lock) {
        this.lock = lock;
    }
}
