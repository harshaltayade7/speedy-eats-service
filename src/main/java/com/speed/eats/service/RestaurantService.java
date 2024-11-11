package com.speed.eats.service;

import com.speed.eats.entity.Restaurant;
import com.speed.eats.exceptions.ItemNotFoundException;
import com.speed.eats.mapper.RestaurantMapper;
import com.speed.eats.repositories.RestaurantRepository;
import com.speed.eats.request.RestaurantRequest;
import com.speed.eats.request.RestaurantUpdateRequest;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Slf4j
@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;
    private final RestaurantMapper restaurantMapper;

    public Restaurant getRestaurant(String id) {
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("Restaurant not found"));
    }
    public List<Restaurant> getRestaurants() {
        return restaurantMapper.toRestaurantList(restaurantRepository.findAll());
    }
    public Restaurant createRestaurant(RestaurantRequest restaurantRequest) {
        return restaurantRepository.save(restaurantMapper.toRestaurant(restaurantRequest));
    }
    public Restaurant updateRestaurant(RestaurantUpdateRequest restaurantUpdateRequest) {
        Restaurant restaurant = restaurantRepository.findById(restaurantUpdateRequest.getId()).orElseThrow(()-> new ItemNotFoundException("Restaurant not found"));
        var mapping  = restaurantMapper.updateRestaurant(restaurantUpdateRequest, restaurant);
        restaurantRepository.save(mapping);
        return  mapping;
    }

}
