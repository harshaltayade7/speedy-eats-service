package com.speed.eats.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Order {
    @Id
    private String id;
    private String customerId;
    private String restaurantId;
    private String driverId;
    private String status;
    private String totalPrice;

    public Order(String customerId, String restaurantId, String driverId, String status, String totalPrice) {
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.driverId = driverId;
        this.status = status;
        this.totalPrice = totalPrice;
    }
}
