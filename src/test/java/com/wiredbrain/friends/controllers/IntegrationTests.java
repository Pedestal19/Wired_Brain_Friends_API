package com.wiredbrain.friends.controllers;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Author: Hosanna Gabe-Oji.
 * Project: friends.
 * Date: 4/4/2020.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegrationTests {

   /* @Autowired
    FriendController friendController;

    @Test
    public void testCreateReadDelete(){
        Friend friend = new Friend("Ian", "Garvey");

        Friend friendResult = friendController.create(friend);

        Iterable<Friend> friends = friendController.read();
        Assertions.assertThat(friends).last().hasFieldOrPropertyWithValue("firstname", "Ian");

        friendController.delete(friendResult.getId());
//        Assertions.assertThat(friendController.read()).isEmpty();
        Assertions.assertThat(friendController.findById(friendResult.getId())).isEmpty();


    }

    @Test(expected = ValidationException.class)
    public void errorHandlingValidationExceptionThrown(){
        friendController.somethingIsWrong();
    }*/

}
