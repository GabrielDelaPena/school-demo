package com.gabriel.schooldemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    // @Value("${app.version}") = will search a propertie called app.version and inject it in the aapVersion attribute.
    @Value("${app.version}")
    private String appVersion;

    @GetMapping
    @RequestMapping("/")
    public Map map() {
        Map map = new HashMap<String, String>();
        map.put("AppVersion", appVersion);
        return map;
    }
}
