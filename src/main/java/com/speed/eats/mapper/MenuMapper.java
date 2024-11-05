package com.speed.eats.mapper;

import com.speed.eats.entity.Menu;
import com.speed.eats.request.MenuRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuMapper {
    public Menu toMenu(MenuRequest menuRequest);
}
