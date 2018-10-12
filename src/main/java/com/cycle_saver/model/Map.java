package com.cycle_saver.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Map {

    @SerializedName("summary_polyline")
    @Expose
    private String summaryPolyline;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("polyline")
    @Expose
    private String polyline;

    public String getSummaryPolyline() {
        return summaryPolyline;
    }

    public void setSummaryPolyline(String summaryPolyline) {
        this.summaryPolyline = summaryPolyline;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPolyline() {
        return polyline;
    }

    public void setPolyline(String polyline) {
        this.polyline = polyline;
    }

}