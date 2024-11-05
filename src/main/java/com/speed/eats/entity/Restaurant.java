package com.speed.eats.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Restaurant {
    @Id
    private String id;
    private String name;
    private String address;
    private String contact;
    private String rating;

    public Restaurant(String name, String address, String contact, String rating) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.rating = rating;
    }
}
