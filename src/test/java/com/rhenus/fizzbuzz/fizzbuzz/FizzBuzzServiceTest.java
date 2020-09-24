package com.rhenus.fizzbuzz.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class FizzBuzzServiceTest {
    @Autowired
    private  FizzBuzzService service;


    @Test
    void first_test_number() {
        assertThat(service.playinggame(1)).isEqualTo("1");

    }
}