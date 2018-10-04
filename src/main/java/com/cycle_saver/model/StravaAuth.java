package com.cycle_saver.model;

public class StravaAuth {

    private String state;

    private String code;

    private String scope;

    private String accessToken;

    public StravaAuth(String state, String code, String scope) {
        this.state = state;
        this.code = code;
        this.scope = scope;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        return "StravaAuth{" +
                "state='" + state + '\'' +
                ", code='" + code + '\'' +
                ", scope='" + scope + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
