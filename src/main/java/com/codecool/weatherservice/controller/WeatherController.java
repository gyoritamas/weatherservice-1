package com.codecool.weatherservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @GetMapping
    public String showWeather() {
        return "I hope the weather is fine...";
    }
}
