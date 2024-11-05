package com.speed.eats.mapper;

import com.speed.eats.entity.Order;
import com.speed.eats.request.OrderRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    public Order toOrder(OrderRequest orderRequest);
}
