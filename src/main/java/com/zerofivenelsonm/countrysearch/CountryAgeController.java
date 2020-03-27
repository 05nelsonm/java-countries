package com.zerofivenelsonm.countrysearch;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class CountryAgeController {
    /**
     * localhost:8181/age/age/{age}
     * Returns all countries that have a median age equal to or greater than the given age
     * @param age of type int
     * */
    @GetMapping(value = "/age/{age}", produces = {"application/json"})
    public ResponseEntity<?> getAllCountriesWithMedianAgeEqualToOrGreaterThan(@PathVariable int age) {

    }

    /**
     * localhost:8181/age/min
     * Returns the country with the smallest median age
     * */
    @GetMapping(value = "/min", produces = {"application/json"})
    public ResponseEntity<?> getCountryWithMinMedianAge() {

    }


    /**
     * localhost:8181/age/max
     * Returns the country with the greatest median age
     * */
    @GetMapping(value = "/max", produces = {"application/json"})
    public ResponseEntity<?> getCountryWithMaxMedianAge() {

    }


    /**
     * STRETCH GOAL:
     * localhost:8181/age/median
     * Returns the country with the median median age
     * */
    @GetMapping(value = "/median", produces = {"application/json"})
    public ResponseEntity<?> getCountryWithMedianMedianAge() {

    }

}
