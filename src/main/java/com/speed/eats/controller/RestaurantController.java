package com.speed.eats.controller;

import com.speed.eats.entity.Restaurant;
import com.speed.eats.request.RestaurantRequest;
import com.speed.eats.request.RestaurantUpdateRequest;
import com.speed.eats.service.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("restaurant")
public class RestaurantController {
    private final RestaurantService restaurantService;

    @GetMapping
    public Restaurant getRestaurant(@RequestParam String id) {
            return restaurantService.getRestaurant(id);
    }
    @GetMapping("/all")
    public List<Restaurant> getRestaurants() {
        return restaurantService.getRestaurants();
    }
    @PostMapping
    public Restaurant createRestaurant(@RequestBody @Valid RestaurantRequest restaurantRequest) {
        return restaurantService.createRestaurant(restaurantRequest);
    }
    @PutMapping
    public Restaurant updateRestaurant(@RequestBody @Valid RestaurantUpdateRequest restaurantUpdateRequest) {
        return restaurantService.updateRestaurant(restaurantUpdateRequest);
    }
}
