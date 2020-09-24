package com.rhenus.fizzbuzz.fizzbuzz;


import com.rhenus.fizzbuzz.fizzbuzz.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}