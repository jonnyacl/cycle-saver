//package com.cycle_saver.converter;
//
//import com.cycle_saver.controller.StravaAuthController;
//import com.cycle_saver.model.Athlete;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.IOException;
//
//public class JSONConverter {
//    public static void main(StravaAuthController stravaAuthController) throws IOException {
//
//        //read json file data to String
//        byte[] jsonData = stravaAuthController
//
//        //create ObjectMapper instance
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        //convert json string to object
//        Athlete athlete = objectMapper.readValue(jsonData, Athlete.class);
//
//        System.out.println("Athlete Object\n"+emp);
//
//        //convert Object to json string
//        Athlete athlete1 = createAthlete();
//        //configure Object mapper for pretty print
//        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
//
//        //writing to console, can write to any output stream such as file
//        StringWriter stringAthlete = new StringWriter();
//        objectMapper.writeValue(stringEmp, athlete1);
//        System.out.println("Athlete JSON is\n"+stringAthlete);
//    }
//}
