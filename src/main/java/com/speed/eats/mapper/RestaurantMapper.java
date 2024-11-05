package com.speed.eats.mapper;

import com.speed.eats.entity.Restaurant;
import com.speed.eats.request.RestaurantRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {
    public Restaurant toRestaurant(RestaurantRequest restaurantRequest);
}
