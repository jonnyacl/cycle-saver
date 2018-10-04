package com.cycle_saver.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import com.cycle_saver.model.*;
import com.cycle_saver.model.StravaAuth;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class StravaAuthController {
    private StravaAuth model;

    public StravaAuthController(StravaAuth model) {
        this.model = model;
    }

    public String getState() {
        return model.getState();
    }

    public void setState(String state) {
        model.setState(state);
    }

    public String getCode() {
        return model.getCode();
    }

    public void setCode(String code) {
        model.setCode(code);
    }

    public String getScope() {
        return model.getScope();
    }

    public void setScope(String scope) {
        model.setScope(scope);
    }

    public String getAccessToken() {
        return model.getAccessToken();
    }

    public void setAccessToken(String accessToken) {
        model.setAccessToken(accessToken);
    }

    public void requestAccessToken() throws IOException {
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost("https://www.strava.com/oauth/token");

        List<NameValuePair> params = new ArrayList<NameValuePair>(3);
        params.add(new BasicNameValuePair("client_id", "28817"));
        params.add(new BasicNameValuePair("client_secret", "f0949137a6f81f4748fedfe204b28c7d02bfb46e"));
        params.add(new BasicNameValuePair("code", getCode()));
        httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

        HttpResponse response = httpclient.execute(httppost);
        HttpEntity entity = response.getEntity();
        InputStream instream = entity.getContent();
        String accessTokenResponse = IOUtils.toString(instream, "UTF-8");
        System.out.println(accessTokenResponse);
        parseAccessTokenResponse(accessTokenResponse);
    }

    public void parseAccessTokenResponse(String accessTokenResponse) throws IOException {
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        //convert json string to object
        StravaToken stravaToken = objectMapper.readValue(accessTokenResponse, StravaToken.class);
        System.out.println("Athlete Token Object\n" + stravaToken);

        Map<String,Object> responseMap = new HashMap<String, Object>();
        responseMap = objectMapper.readValue(accessTokenResponse, new TypeReference<Map<String,Object>>(){});
        Map<String,Object> athlete = (Map<String,Object>)responseMap.get("athlete");
        System.out.println("Map is: "+athlete);
        unpackNested(athlete);
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("athlete")
    private void unpackNested(Map<String, Object> athlete) {
        String athleteName = (String) athlete.get("firstname");
        System.out.println(athlete);
        System.out.println(athleteName);
    }
}

