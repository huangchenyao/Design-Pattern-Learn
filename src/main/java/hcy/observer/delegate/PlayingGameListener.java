package hcy.observer.delegate;

import java.time.LocalDateTime;

public class PlayingGameListener {
    public PlayingGameListener() {
        System.out.println("playing");
    }

    public void stopPlayingGame(LocalDateTime localDateTime) {
        System.out.println("stop playing" + localDateTime);
    }
}

