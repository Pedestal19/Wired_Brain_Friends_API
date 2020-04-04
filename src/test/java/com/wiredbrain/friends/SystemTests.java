package com.wiredbrain.friends;

import com.wiredbrain.friends.model.Friend;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: friends.
 * Date: 4/4/2020.
 */
public class SystemTests {

    @Test
    public void testCreateReadDelete(){

        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:7777/friend";

        Friend friend = new Friend("Hosanna", "Gabe-Oji");
        ResponseEntity<Friend> entity = restTemplate.postForEntity(url, friend, Friend.class);

        Friend[] friends = restTemplate.getForObject(url, Friend[].class);
        Assertions.assertThat(friends).extracting(Friend::getFirstname).containsOnly("Hosanna");

        restTemplate.delete(url + "/" +entity.getBody().getId());
        Assertions.assertThat(restTemplate.getForObject(url, Friend[].class)).isEmpty();

    }

}
