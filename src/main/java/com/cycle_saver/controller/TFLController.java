package com.cycle_saver.controller;

import com.cycle_saver.model.User;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;

import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class TFLController {

    public void calculateJourney(List startLL, List endLL, String app_key) {
        HttpClient httpclient = HttpClients.createDefault();
        URI uri = null;
        try {
            uri = new URIBuilder()
                    .setScheme("https")
                    .setHost("api.tfl.gov.uk")
                    .setPath("/journey/journeyresults/" + 51.47,-0.02 + "/to/" + 51.51,-0.08)
                    .setParameter("app_key", app_key)
                    .build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        HttpGet httpget = new HttpGet(uri);
        System.out.println(httpget.getURI());

        HttpResponse response = httpclient.execute(httpget);
        HttpEntity entity = response.getEntity();
        InputStream instream = entity.getContent();
        String output = IOUtils.toString(instream, "UTF-8");
        parseActivitiesResponse(athlete, output);
    }
}
