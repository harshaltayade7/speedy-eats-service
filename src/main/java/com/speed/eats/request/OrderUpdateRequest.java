package com.speed.eats.request;

import lombok.Data;

@Data
public class OrderUpdateRequest {
    private String id;
    private String customerId;
    private String restaurantId;
    private String driverId;
    private String status;
    private String totalPrice;
}
