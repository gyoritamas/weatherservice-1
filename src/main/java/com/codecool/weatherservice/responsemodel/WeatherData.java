package com.codecool.weatherservice.responsemodel;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {
    public List<Weather> weather;
    public Main main;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeatherData{");
        sb.append("weather=").append(weather);
        sb.append(", main=").append(main);
        sb.append('}');
        return sb.toString();
    }
}

class Weather {
    public String main;
    public String description;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Weather{");
        sb.append("main='").append(main).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class Main {
    public Double temp;
    public Double feels_like;
    public Double temp_min;
    public Double temp_max;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Main{");
        sb.append("temp=").append(temp);
        sb.append(", feels_like=").append(feels_like);
        sb.append(", temp_min=").append(temp_min);
        sb.append(", temp_max=").append(temp_max);
        sb.append('}');
        return sb.toString();
    }
}
