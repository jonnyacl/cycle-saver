package com.cycle_saver.model;

import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class StravaAuth {

    private String state;

    private String code;

    private String scope;

    private String accessToken;

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

    public String getAccessToken() throws IOException {
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost("https://www.strava.com/oauth/token");

        List<NameValuePair> params = new ArrayList<NameValuePair>(3);
        params.add(new BasicNameValuePair("client_id", "CLIENT_ID_HERE"));
        params.add(new BasicNameValuePair("client_secret", "CLIENT_SECRET_HERE"));
        params.add(new BasicNameValuePair("code", this.code));
        httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

        HttpResponse response = httpclient.execute(httppost);
        HttpEntity entity = response.getEntity();
        InputStream instream = entity.getContent();
        this.accessToken = IOUtils.toString(instream, "UTF-8");

        return this.accessToken;
    }
}
