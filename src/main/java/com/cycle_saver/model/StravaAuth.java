package com.cycle_saver.model;

public class StravaAuth {

    private String state;

    private String code;

    private String scope;

    public StravaAuth(String state, String code, String scope){
        this.code = code;
        this.state = state;
        this.scope = scope;
    }

    public String getCode() {
        return code;
    }

    public String getScope() {
        return scope;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString(){
        return "Code = " + code + "State = " + state + "Scope = " + scope;
    }
}
