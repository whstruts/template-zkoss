package com.tabeldata;


import org.zkoss.bind.annotation.Init;

public class MyWCSViewModel {

    private int count;

    @Init
    public void init() {
        count = 100;
    }
}
