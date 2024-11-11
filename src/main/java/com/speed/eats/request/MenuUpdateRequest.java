package com.speed.eats.request;

import lombok.Data;

@Data
public class MenuUpdateRequest {
    private String id;
    private String restaurantId;
    private String name;
    private String price;
    private String description;
}
