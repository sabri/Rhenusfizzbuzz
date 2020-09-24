package com.rhenus.fizzbuzz.fizzbuzz;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class FizzBuzzControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private FizzBuzzService service;

    @Test
    void getNumber() throws Exception{
        when(service.playinggame(anyInt())).thenReturn("number!");
        mockMvc.perform(get("/api/v1/fizzbuzz/number/42"))
                .andExpect(status().isOk()).andExpect(content().string("number"));
        verify(service, times(1)).playinggame(42);
    }

}
