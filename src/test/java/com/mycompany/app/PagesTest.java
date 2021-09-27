package com.mycompany.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PagesTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testMain() throws Exception {
        this.mockMvc.perform(get("/"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Create new room")))
                .andExpect(content().string(containsString("List of rooms")));
    }

    @Test
    public void testCreateNewRoom() throws Exception {
        this.mockMvc.perform(get("/new"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Add new room")))
                .andExpect(content().string(containsString("Name of your room:")))
                .andExpect(content().string(containsString("Country:")))
                .andExpect(content().string(containsString("Belarus")))
                .andExpect(content().string(containsString("Lithuania")))
                .andExpect(content().string(containsString("Latvia")))
                .andExpect(content().string(containsString("Russia")))
                .andExpect(content().string(containsString("Ukraine")))
                .andExpect(content().string(containsString("Poland")));
    }
}
