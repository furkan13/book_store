package com.example.Book.Store.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class BookTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testShowAllBook () throws Exception {
        this.mockMvc.perform(get("/show-all-books")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Show All Books")));
    }

    @Test
    public void testAddBook () throws Exception {
        this.mockMvc.perform(get("/add-book")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Add Book")));
    }


}
