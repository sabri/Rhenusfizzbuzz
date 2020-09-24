package com.rhenus.fizzbuzz.fizzbuzz;


import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class FizzBuzzServiceTest {
    @Autowired
    private FizzBuzzService service;

    @ParameterizedTest
    @CsvSource(value = {"1,1","2,2"})
    void test_normal_number(int input, String expected) {
        assertThat(service.playinggame(input)).isEqualTo(expected);

    }

    @ParameterizedTest
    @ValueSource(ints = {3,6})
    void divideby3_normal_number(int input) {
        assertThat(service.playinggame(input)).isEqualTo("Fizz");

    }

    @ParameterizedTest
    @ValueSource(ints = {5,10})
    void divided5_normal_number(int input) {
        assertThat(service.playinggame(input)).isEqualTo("Buzz");

    }
    @ParameterizedTest
    @ValueSource(ints = {15,30})
    void divideby15_normal_number(int input) {
        assertThat(service.playinggame(input)).isEqualTo("FizzBuzz");

    }

}