package com.hendyirawan.wisatadunia.rest;

import com.hendyirawan.wisatadunia.core.City;
import com.hendyirawan.wisatadunia.core.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
public class CitiesController {
    private static final Logger log = LoggerFactory.getLogger(CitiesController.class);

    @GetMapping("/{cityId}")
    public City findOne(@PathVariable("cityId") Integer cityId, @RequestParam("projection") String projection) {
        log.info("Requested GET /cities cityId={cityId} projection={projection}", cityId, projection);
        final Country country = new Country();
        country.setId("IT");
        country.setName("Italy");
        final City city = new City();
        city.setId(1);
        city.setName("Rome");
        city.setShortDesc("is a historical powerhouse");
        city.setTimeZone("Europe/Rome");
        city.setFileName("rome.jpg");
        city.setTemperatureCelsius(-2.0);
        city.setWeather("Scattered clouds");
        city.setCountry(country);
        return city;
    }
}

