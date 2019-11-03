package hcy.bridge;

import lombok.Setter;

public abstract class HandsetBrand {
    @Setter
    protected HandsetSoft handsetSoft;

    public abstract void run();
}
