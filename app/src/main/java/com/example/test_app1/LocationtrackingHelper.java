package com.example.test_app1;

public class LocationtrackingHelper {

    private double latitut;
    private double longitude;

    LocationtrackingHelper(double latitut, double longitude){
        this.latitut = latitut;
        this.longitude = longitude;
    }

    public double getLatitut() {
        return latitut;
    }

    public void setLatitut(double latitut) {
        this.latitut = latitut;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
