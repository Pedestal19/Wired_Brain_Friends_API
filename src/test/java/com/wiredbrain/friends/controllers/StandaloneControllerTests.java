package com.wiredbrain.friends.controllers;

import com.wiredbrain.friends.model.Friend;
import com.wiredbrain.friends.services.FriendService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: friends.
 * Date: 4/4/2020.
 */

@RunWith(SpringRunner.class)
//@WebMvcTest(FriendController.class)
public class StandaloneControllerTests {

    @MockBean
    FriendService friendService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testCreateReadDelete() throws Exception{

        Friend friend = new Friend("Raymond", "Reddington");
        List<Friend> friends = Arrays.asList(friend);

        Mockito.when(friendService.findAll()).thenReturn(friends);

        mockMvc.perform(MockMvcRequestBuilders.get("/friend"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", Matchers.hasSize(1)))
                .andExpect(jsonPath("$[0].first-name", Matchers.is("Raymond")));
    }

}
