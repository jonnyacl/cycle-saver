package com.cycle_saver.model;

import java.lang.reflect.Array;
import java.util.List;

public class Journey {
    private List start_latlng;
    private List end_latlng;

    public Journey(List longitude, List end_latlng) {
        this.start_latlng = longitude;
        this.end_latlng = end_latlng;
    }

    public List getLongitude() {
        return start_latlng;
    }

    public void setLongitude(List longitude) {
        this.start_latlng = longitude;
    }

    public List getEnd_latlng() {
        return end_latlng;
    }

    public void setEnd_latlng(List end_latlng) {
        this.end_latlng = end_latlng;
    }


}
