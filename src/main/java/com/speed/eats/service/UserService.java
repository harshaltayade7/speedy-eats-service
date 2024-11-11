package com.speed.eats.service;

import com.speed.eats.entity.Restaurant;
import com.speed.eats.entity.User;
import com.speed.eats.exceptions.ItemNotFoundException;
import com.speed.eats.mapper.UserMapper;
import com.speed.eats.repositories.UserRepository;
import com.speed.eats.request.RestaurantRequest;
import com.speed.eats.request.RestaurantUpdateRequest;
import com.speed.eats.request.UserRequest;
import com.speed.eats.request.UserUpdateRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User getUser(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("User not found"));
    }

    public List<User> getUsers() {
        return userMapper.toUserList(userRepository.findAll());
    }

    public User createUser(UserRequest userRequest) {
        return userRepository.save(userMapper.toUser(userRequest));
    }

    public User updateUser(UserUpdateRequest userUpdateRequest) {
        User user = userRepository.findById(userUpdateRequest.getUsername()).orElseThrow(() -> new ItemNotFoundException("User not found"));
        var mapping = userMapper.updateUser(userUpdateRequest, user);
        userRepository.save(mapping);
        return mapping;
    }

}
