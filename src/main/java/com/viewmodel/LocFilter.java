package com.viewmodel;

public class LocFilter {

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location==null?"":location.trim();;
    }

    private String location;
}
