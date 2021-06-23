package com.codecool.weatherservice.service;

import com.codecool.weatherservice.responsemodel.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private static final String urlFormat =
            "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric&lang=hu";

    @Value("${api_key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @Cacheable("weatherdata")
    public String getWeatherData(String city) {
        printRequestsForCacheTest(city);
        final String weatherUrl = String.format(urlFormat, city, apiKey);

        return restTemplate.getForObject(weatherUrl, WeatherData.class).toString();
    }

    private void printRequestsForCacheTest(String city) {
        System.out.printf("Requesting weather data of %s...%n", city);
    }
}
