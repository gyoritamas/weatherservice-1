package com.codecool.weatherservice.controller;

import com.codecool.weatherservice.responsemodel.WeatherData;
import com.codecool.weatherservice.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public WeatherData showWeatherInBudapest() {
        return weatherService.getWeatherData("Budapest");
    }

    @GetMapping("/{city}")
    public WeatherData showWeather(@PathVariable String city){
        return weatherService.getWeatherData(city);
    }
}
