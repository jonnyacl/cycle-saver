package com.cycle_saver.handler;

import com.cycle_saver.controller.StravaAuthController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

public class StravaAuthHandler {

    @RequestMapping("/auth/strava")
    String auth(@RequestParam(value = "state") String state,
                @RequestParam(value = "code") String code,
                @RequestParam(value = "scope") String scope) throws IOException {
        StravaAuthController authController = new StravaAuthController();
        authController.authorise(code);
        return "welcome";
    }
}
