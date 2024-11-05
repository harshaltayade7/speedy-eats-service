package com.speed.eats.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Menu {
    @Id
    private String id;
    private String restaurantId;
    private String name;
    private String price;
    private String description;

    public Menu(String restaurantId, String name, String price, String description) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.price = price;
        this.description = description;
    }
}