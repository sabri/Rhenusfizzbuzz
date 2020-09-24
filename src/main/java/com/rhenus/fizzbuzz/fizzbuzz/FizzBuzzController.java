package com.rhenus.fizzbuzz.fizzbuzz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




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

    @RequestMapping(value = "/numbers/{input}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> getNumbers(@PathVariable(name="input") int input) {

        String response = this.service.getNumbers_all(input);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}