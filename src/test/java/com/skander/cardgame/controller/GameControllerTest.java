package com.skander.cardgame.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.skander.cardgame.model.Hand;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GameControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;


    @Test
    @DisplayName("should return OK Response")
    void getHandTest() throws Exception {
        mockMvc.perform(get("/game/getCards")).andExpect(status().isOk())
                .andExpect(result -> {
                    mockMvc.perform(get("/game/getCards")).andExpect(status().isOk())
                            .andExpect(content -> {
                                var hand = objectMapper.readValue(content.getResponse().getContentAsString(), Hand.class);
                                assertThat(hand).isNotNull();
                            });
                });
    }
}