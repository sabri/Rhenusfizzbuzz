package com.rhenus.fizzbuzz.fizzbuzz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/fizzbuzz/")
public class FizzBuzzController {

    private final FizzBuzzService service;

    @Autowired
    public FizzBuzzController(FizzBuzzService service) {
        this.service = service;
    }


    @GetMapping("number/{input}")
    public String getNumber(@PathVariable int input){
        return service.playinggame(input);
    }
    @RequestMapping(value = "/cumulative/{input}", method = RequestMethod.GET)
    public ResponseEntity<String> getCumulativeAnswer(@PathVariable(name="input", required=true) int input) {

        String response = this.service.getNumbers_all(input);

        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}