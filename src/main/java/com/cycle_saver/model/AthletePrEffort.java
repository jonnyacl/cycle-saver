package com.cycle_saver.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AthletePrEffort {

    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("start_date_local")
    @Expose
    private String startDateLocal;
    @SerializedName("elapsed_time")
    @Expose
    private Integer elapsedTime;
    @SerializedName("is_kom")
    @Expose
    private Boolean isKom;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("start_date")
    @Expose
    private String startDate;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getStartDateLocal() {
        return startDateLocal;
    }

    public void setStartDateLocal(String startDateLocal) {
        this.startDateLocal = startDateLocal;
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Boolean getIsKom() {
        return isKom;
    }

    public void setIsKom(Boolean isKom) {
        this.isKom = isKom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

}