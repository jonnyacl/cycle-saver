package com.cycle_saver.model;

public class StravaToken {
    private String token_type;

    private String access_token;

    private String athlete;

    public StravaToken(String token_type, String access_token, String athlete) {
        this.token_type = token_type;
        this.access_token = access_token;
        this.athlete = athlete;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAthlete() {
        return athlete;
    }

    public void setAthlete(String athlete) {
        this.athlete = athlete;
    }

    @Override
    public String toString() {
        return "StravaToken{" +
                "token_type='" + token_type + '\'' +
                ", access_token='" + access_token + '\'' +
                ", athlete='" + athlete + '\'' +
                '}';
    }
}
