package com.speed.eats.request;

import lombok.Data;

@Data
public class OrderRequest {
    private String customerId;
    private String restaurantId;
    private String driverId;
    private String status;
    private String totalPrice;
}
