package com.cycle_saver.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Direction {

    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("action")
    @Expose
    private Integer action;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

}