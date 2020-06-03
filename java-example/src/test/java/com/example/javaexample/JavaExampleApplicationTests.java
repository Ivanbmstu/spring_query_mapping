package com.example.javaexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class JavaExampleApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    void getList() throws Exception {

        mvc.perform(get("/list").param("values", "1,2,3"))
           .andExpect(content().string("success 1"));
    }
    @Test
    void getPojo() throws Exception {

        mvc.perform(get("/").param("values", "1,2,3"))
           .andExpect(content().string("success 1"));
    }
    
    @Test
    void getPojoConstructor() throws Exception {

        mvc.perform(get("/ctr").param("values", "1,2,3"))
           .andExpect(content().string("success 1"));
    }

}
