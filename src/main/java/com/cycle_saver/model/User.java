package com.cycle_saver.model;

import java.util.List;

public class User {

    private Integer userId;

    private String accessToken;

    private List<Route> routes;

    public User(Integer userId, String accessToken){
        this.userId = userId;
        this.accessToken = accessToken;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return userId;
    }

    public void setAccessToken(String accessToken){
        this.accessToken = accessToken;
    }

    public String getAccessToken(){
        return accessToken;
    }

    public void setRoutes(List<Route> routes){
        this.routes = routes;
    }

    public List<Route> getRoutes() {
        return routes;
    }
}
