package com.tabeldata;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;

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

    @Command
    public void toWCS() {
        Executions.sendRedirect("wcs.zul");
    }

    public int getCount() {
        return count;
    }
}
