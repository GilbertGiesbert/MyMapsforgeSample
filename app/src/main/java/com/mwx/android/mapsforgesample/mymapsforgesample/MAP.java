package com.mwx.android.mapsforgesample.mymapsforgesample;

/**
 * Created by joern on 24.02.2016.
 */
public enum MAP{

    GERMANY("germany.map", 52.517037, 13.38886),
    BERLIN("berlin.map", 52.517037, 13.38886);


    private String fileName;
    private double startLat;
    private double startLong;

    private MAP(String fileName, double startLat, double startLong) {
        this.fileName = fileName;
        this.startLat = startLat;
        this.startLong = startLong;
    }

    public String getFileName() {
        return fileName;
    }

    public double getStartLat() {
        return startLat;
    }

    public double getStartLong() {
        return startLong;
    }
}
