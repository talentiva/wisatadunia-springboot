package com.hendyirawan.wisatadunia.core;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "attractionRelated", types = {Attraction.class})
public interface AttractionRelated {
    public Integer getId();
    public String getName();
    public String getSubtitle();
    public boolean isFavorited();
    public String getDescription();
    public Double getDistance();
    public Integer getDuration();
    public Integer getRank();
    public Double getLatitude();
    public Double getLongitude();
    public String getLocation();
    public String getTimeOpen();
    public String getTicket();
    public String getPhoneNumber();
    public String getEmail();
    public String getWebsite();
    public String getFileName();
    public City getCity();
    public AttractionCategory getAttractionCategory();
}
