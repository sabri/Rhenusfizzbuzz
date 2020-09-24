package com.rhenus.fizzbuzz.fizzbuzz;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fizzbuzz/")
public class FizzBuzzController {
    @GetMapping("number/{input}")
    public String getNumber(@PathVariable int input){
        return "number!";
    }

}
