package com.hendyirawan.wisatadunia.repo;

import com.hendyirawan.wisatadunia.core.Attraction;
import com.hendyirawan.wisatadunia.core.AttractionCategory;
import com.hendyirawan.wisatadunia.core.City;
import com.hendyirawan.wisatadunia.core.Country;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    /**
     * Expose ID field, see https://stackoverflow.com/a/25066565/122441
     * @param config
     */
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Attraction.class, AttractionCategory.class,
                City.class, Country.class);
    }
}
