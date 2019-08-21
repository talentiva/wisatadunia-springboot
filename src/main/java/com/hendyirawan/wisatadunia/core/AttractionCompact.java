package com.hendyirawan.wisatadunia.core;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "attractionCompact", types = {Attraction.class})
public interface AttractionCompact {
    public Integer getId();

    public String getName();

    public String getSubtitle();

    public boolean isFavorited();

    public String getFileName();
}
