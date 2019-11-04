package com.zerofivenelsonm.countrysearch;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/names")
public class CountryNamesController {
    /**
     * localhost:8181/names/all
     * Returns the names of all countries in alphabetical order.
     * */
    @GetMapping(value = "/all", produces = {"application/json"})
    public ResponseEntity<?> getAllCountryNames() {

    }

    /**
     * localhost:8181/names/start/{letter}
     * Returns the names of all countries in alphabetical order that begin with the given letter.
     *
     * @param letter of type char
     * */
    @GetMapping(value = "/start/{letter}", produces = {"application/json"})
    public ResponseEntity<?> getAllCountryNamesThatStartWith(@PathVariable char letter) {

    }

    /**
     * localhost:8181/names/size/{number}
     * Returns all countries in alphabetical order that have a name equal to or longer than given number.
     *
     * @param number of type int
     * */
    @GetMapping(value = "/size/{number}", produces = {"application/json"})
    public ResponseEntity<?> getAllCountryNamesWithNameLengthEqualToOrGreaterThan(@PathVariable int number) {

    }
}
