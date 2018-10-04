/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cycle_saver;

import com.cycle_saver.controller.StravaAuthController;
import com.cycle_saver.model.StravaAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

import static java.lang.Integer.parseInt;

@Controller
@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/auth/strava")
    String auth(@RequestParam(value = "state") String state,
                @RequestParam(value = "code") String code,
                @RequestParam(value = "scope") String scope) throws IOException {
        StravaAuth stravaAuth = new StravaAuth(state, code, scope);
        System.out.println("Authorisation Information is: " + stravaAuth.toString());
        StravaAuthController stravaAuthController = new StravaAuthController(stravaAuth);
        stravaAuthController.requestAccessToken();
        System.out.println(stravaAuthController.getAccessToken());
//        HashMap<String,Object> athleteMap = new ObjectMapper().readValue(auth.getAccessToken(), HashMap.class);
//        Athlete athlete = new Athlete(parseInt(athleteMap.get("id").toString()));
//        System.out.println(athlete.getId());
        return "auth_strava";
    }

}
