package hcy.observer.delegate;

import java.time.LocalDateTime;

public class WatchingTVListener {
    public WatchingTVListener() {
        System.out.println("watching TV");
    }

    public void stopWatchingTV(LocalDateTime localDateTime) {
        System.out.println("stop watching" + localDateTime);
    }
}