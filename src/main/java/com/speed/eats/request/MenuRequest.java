package com.speed.eats.request;

import lombok.Data;

@Data
public class MenuRequest {
    private String restaurantId;
    private String name;
    private String price;
    private String description;
}
