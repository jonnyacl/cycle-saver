package com.cycle_saver.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Route {

    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("athlete")
    @Expose
    private String athlete;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("elevation_gain")
    @Expose
    private Double elevationGain;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("segments")
    @Expose
    private List<Segment> segments = null;
    @SerializedName("starred")
    @Expose
    private Boolean starred;
    @SerializedName("directions")
    @Expose
    private List<Direction> directions = null;
    @SerializedName("sub_type")
    @Expose
    private Integer subType;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("map")
    @Expose
    private Map map;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;

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

    public String getAthlete() {
        return athlete;
    }

    public void setAthlete(String athlete) {
        this.athlete = athlete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getElevationGain() {
        return elevationGain;
    }

    public void setElevationGain(Double elevationGain) {
        this.elevationGain = elevationGain;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public List<Direction> getDirections() {
        return directions;
    }

    public void setDirections(List<Direction> directions) {
        this.directions = directions;
    }

    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
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

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

}