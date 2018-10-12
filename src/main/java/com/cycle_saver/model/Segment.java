package com.cycle_saver.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Segment {

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("average_grade")
    @Expose
    private Double averageGrade;
    @SerializedName("maximum_grade")
    @Expose
    private Double maximumGrade;
    @SerializedName("climb_category")
    @Expose
    private Integer climbCategory;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("elevation_high")
    @Expose
    private Double elevationHigh;
    @SerializedName("athlete_pr_effort")
    @Expose
    private AthletePrEffort athletePrEffort;
    @SerializedName("start_latlng")
    @Expose
    private String startLatlng;
    @SerializedName("elevation_low")
    @Expose
    private Double elevationLow;
    @SerializedName("end_latlng")
    @Expose
    private String endLatlng;
    @SerializedName("activity_type")
    @Expose
    private String activityType;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("state")
    @Expose
    private String state;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Double getMaximumGrade() {
        return maximumGrade;
    }

    public void setMaximumGrade(Double maximumGrade) {
        this.maximumGrade = maximumGrade;
    }

    public Integer getClimbCategory() {
        return climbCategory;
    }

    public void setClimbCategory(Integer climbCategory) {
        this.climbCategory = climbCategory;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getElevationHigh() {
        return elevationHigh;
    }

    public void setElevationHigh(Double elevationHigh) {
        this.elevationHigh = elevationHigh;
    }

    public AthletePrEffort getAthletePrEffort() {
        return athletePrEffort;
    }

    public void setAthletePrEffort(AthletePrEffort athletePrEffort) {
        this.athletePrEffort = athletePrEffort;
    }

    public String getStartLatlng() {
        return startLatlng;
    }

    public void setStartLatlng(String startLatlng) {
        this.startLatlng = startLatlng;
    }

    public Double getElevationLow() {
        return elevationLow;
    }

    public void setElevationLow(Double elevationLow) {
        this.elevationLow = elevationLow;
    }

    public String getEndLatlng() {
        return endLatlng;
    }

    public void setEndLatlng(String endLatlng) {
        this.endLatlng = endLatlng;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}