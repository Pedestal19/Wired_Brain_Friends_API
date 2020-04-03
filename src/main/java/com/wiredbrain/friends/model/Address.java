package com.wiredbrain.friends.model;

import javax.persistence.Embeddable;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: friends.
 * Date: 4/3/2020.
 */
@Embeddable
public class Address {

    private String street;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
