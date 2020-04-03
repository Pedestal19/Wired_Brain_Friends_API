package com.wiredbrain.friends.controllers;

import com.wiredbrain.friends.model.Friend;
import com.wiredbrain.friends.services.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: friends.
 * Date: 4/3/2020.
 */

@RestController
public class FriendController {

    @Autowired
    FriendService friendService;

    @PostMapping("/friend")
    Friend create(@RequestBody  Friend friend){
        return friendService.save(friend);
    }

    @GetMapping("/friend")
    Iterable<Friend> read(){
        return friendService.findAll();
    }

    @PutMapping("/friend")
    Friend update(@RequestBody Friend friend){
        return friendService.save(friend);
    }

    @DeleteMapping("/friend/{id}")
    void delete(@PathVariable Integer id){
        friendService.deleteById(id);
    }
}
