package com.speed.eats.request;

import lombok.Data;

@Data
public class RestaurantRequest {
    private String name;
    private String address;
    private String contact;
    private String rating;
}

