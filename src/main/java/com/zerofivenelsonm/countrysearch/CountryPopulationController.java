package com.zerofivenelsonm.countrysearch;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/population")
public class CountryPopulationController {
    /**
     * localhost:8181/population/size/{people}
     * Returns all countries equal to or greater than the given population
     * @param people of type long
     * */
    @GetMapping(value = "/size/{people}", produces = {"application/json"})
    public ResponseEntity<?> getAllCountriesEqualToOrGreaterThan(@PathVariable long people) {

    }

    /**
     * localhost:8181/population/min
     * Returns the country with the smallest population
     * */
    @GetMapping(value = "/min", produces = {"application/json"})
    public ResponseEntity<?> getCountryWithMinPopulation() {

    }

    /**
     * localhost:8181/population/max
     * Returns the country with the largest population
     * */
    @GetMapping(value = "/max", produces = {"application/json"})
    public ResponseEntity<?> getCountryWithMaxPopulation() {

    }

    /**
     * STRETCH GOAL:
     * localhost:8181/population/median
     * Returns the country with the median population
     * */
    @GetMapping(value = "/median", produces = {"application/json"})
    public ResponseEntity<?> getCountryWithMedianPopulation() {

    }
}
