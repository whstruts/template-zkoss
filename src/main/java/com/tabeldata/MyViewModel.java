package com.tabeldata;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

public class MyViewModel {

    private int count;

    @Init
    public void init() {
        count = 100;
    }

    @Command
    @NotifyChange("count")
    public void cmd() {
        ++count;
    }
    @Command
    @NotifyChange("count")
    public void sub() {
        --count;
    }

    public int getCount() {
        return count;
    }
}
