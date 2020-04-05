package com.wiredbrain.friends.services;

import com.wiredbrain.friends.model.Address;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: friends.
 * Date: 4/5/2020.
 */
public interface AddressService extends CrudRepository<Address, Integer> {
}
