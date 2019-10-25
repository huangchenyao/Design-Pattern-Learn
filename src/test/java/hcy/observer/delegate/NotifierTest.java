package hcy.observer.delegate;

import org.junit.Test;

import java.time.LocalDateTime;

public class NotifierTest {
    @Test
    public void test() {
        Notifier goodNotifier = new ConcreteNotifier();
        PlayingGameListener playingGameListener = new PlayingGameListener();
        WatchingTVListener watchingTVListener = new WatchingTVListener();
        goodNotifier.addListener(playingGameListener, "stopPlayingGame", LocalDateTime.now());
        goodNotifier.addListener(watchingTVListener, "stopWatchingTV", LocalDateTime.now());
        goodNotifier.notifyX();
    }
}