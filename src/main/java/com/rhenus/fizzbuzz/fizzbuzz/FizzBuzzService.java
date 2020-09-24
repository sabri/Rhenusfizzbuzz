package com.rhenus.fizzbuzz.fizzbuzz;

import org.springframework.stereotype.Service;


@Service
public class FizzBuzzService {

    public String playinggame(int input){

        if (isDivisibleBy(input,15)){
            return "FizzBuzz";
        }

        if (isDivisibleBy(input,3)){
            return "Fizz";
        }
        if (isDivisibleBy(input,5)){
            return "Buzz";
        }

        return String.valueOf(input);
    }

    private boolean isDivisibleBy(int input, int i) {
        return input % i == 0;
    }
}

