package com.hendyirawan.wisatadunia.core;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "cityRelated", types = {City.class})
public interface CityRelated {
    Integer getId();
    String getName();
    String getShortDesc();
    String getTimeZone();
    String getFileName();
    Double getTemperatureCelsius();
    String getWeather();
    Country getCountry();
}
