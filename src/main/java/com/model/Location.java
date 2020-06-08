package com.model;

public class Location {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualityType() {
        return qualityType;
    }

    public void setQualityType(String qualityType) {
        this.qualityType = qualityType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    private String name;
    private String qualityType;
    private String status;

    public String getLocType() {
        return locType;
    }

    public void setLocType(String locType) {
        this.locType = locType;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    private String locType;
    private String area;
    public Location(String name, String qualityType, String status,
                String locType, String area) {
        this.name = name;
        this.qualityType = qualityType;
        this.status = status;
        this.locType = locType;
        this.area = area;
    }
}
