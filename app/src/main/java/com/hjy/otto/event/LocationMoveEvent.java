package com.hjy.otto.event;

public class LocationMoveEvent {

    public float longitude;
    public float latitude;

    public LocationMoveEvent(float longitude, float latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
