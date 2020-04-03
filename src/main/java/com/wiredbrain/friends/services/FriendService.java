package com.wiredbrain.friends.services;

import com.wiredbrain.friends.model.Friend;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: friends.
 * Date: 4/3/2020.
 */
public interface FriendService extends CrudRepository<Friend, Integer> {
    
}
