package com.june.travel.model;

public enum Region {
    AMERICAS("The Americas"), APAC("Asia Pacific"), EUROPE("Europe"), MEA("Middle East/Africa");

    private String name;

    private Region(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getRegion(int index) {
        return Region.values()[index].toString();
    }

}
