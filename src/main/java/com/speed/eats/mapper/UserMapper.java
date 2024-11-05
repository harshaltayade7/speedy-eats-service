package com.speed.eats.mapper;

import com.speed.eats.entity.User;
import com.speed.eats.request.UserRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    public User toUser(UserRequest userRequest);
}
