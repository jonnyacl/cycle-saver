package com.cycle_saver.controller;

import com.cycle_saver.model.user.User;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;

@RestController
@RequestMapping("/user")
public class AuthController extends BaseController {

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public Response signUp(String body) {
        Gson gson = new Gson();
        User user = gson.fromJson(body, User.class);
        // check if user already exists, add them or send error
        return Response.ok(user).build();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Response login(String body) {
        // return jwt with user details to be stored on FE and send in each request for further auth
        Gson gson = new Gson();
        User user = gson.fromJson(body, User.class);
        return Response.ok().build();
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public Response logout(String body) {
        return Response.ok().build();
    }

    private User checkLogin(User user) {
        return user;
    }
}
