package com.cycle_saver.cookie_service;

import com.cycle_saver.Utils.HashGenerator;
import com.cycle_saver.data_service.UserDataService;

import java.net.*;
import java.util.List;

public class CookieService {

    public void setCookie(String userId){
        try {
            // instantiate CookieManager
            CookieManager manager = new CookieManager();
            CookieHandler.setDefault(manager);
            CookieStore cookieJar =  manager.getCookieStore();

            String userHash = new HashGenerator().generateUniqueHash();

            new UserDataService().updateUser(userId, "userToken", userHash);
            // create cookie
            HttpCookie cookie = new HttpCookie("user", userHash);

            // add cookie to CookieStore for a
            // particular URL
            URL url = new URL("https://cycle-saver.herokuapp.com");
            cookieJar.add(url.toURI(), cookie);
            System.out.println("Added cookie using cookie handler");
        } catch(Exception e) {
            System.out.println("Unable to set cookie using CookieHandler");
            e.printStackTrace();
        }
    }

    public void getCookie(){
        try {
            // Instantiate CookieManager;
            // make sure to set CookiePolicy
            CookieManager manager = new CookieManager();
            manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
            CookieHandler.setDefault(manager);

            // get content from URLConnection;
            // cookies are set by web site
            URL url = new URL("https://cycle-saver.herokuapp.com");
            URLConnection connection = url.openConnection();
            connection.getContent();

            // get cookies from underlying
            // CookieStore
            CookieStore cookieJar =  manager.getCookieStore();
            List<HttpCookie> cookies =
                    cookieJar.getCookies();
            for (HttpCookie cookie: cookies) {
                System.out.println("CookieHandler retrieved cookie: " + cookie);
            }
        } catch(Exception e) {
            System.out.println("Unable to get cookie using CookieHandler");
            e.printStackTrace();
        }
    }
}
