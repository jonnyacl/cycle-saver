package com.cycle_saver.model;

public class StravaAuth {

    private String state;

    private String code;

    private String scope;

    public StravaAuth(String code) {
        this.code = code;
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

    public String toString() {
        return "StravaAuth{" +
                "state='" + state + '\'' +
                ", code='" + code + '\'' +
                ", scope='" + scope + '\'' +
                '}';
    }
}
