package hcy.observer;

import java.util.EventObject;

public class WriterEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param writerNew the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public WriterEvent(WriterNew writerNew) {
        super(writerNew);
    }

    public WriterNew getWriter() {
        return (WriterNew) super.getSource();
    }
}
