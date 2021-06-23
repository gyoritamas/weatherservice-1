package com.codecool.weatherservice.service;

import com.codecool.weatherservice.responsemodel.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    public String getWeatherData() {
        final String weatherUrl = String.format(urlFormat, "Budapest", apiKey);

        return restTemplate.getForObject(weatherUrl, WeatherData.class).toString();
    }

    public String getWeatherData(String city) {
        final String weatherUrl = String.format(urlFormat, city, apiKey);

        return restTemplate.getForObject(weatherUrl, WeatherData.class).toString();
    }
}
