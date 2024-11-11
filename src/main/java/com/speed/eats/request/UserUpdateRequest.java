package com.speed.eats.request;

import lombok.Data;

@Data
public class UserUpdateRequest {
    private String username;
    private String password;
}
