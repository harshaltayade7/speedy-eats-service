package com.speed.eats.repositories;

import com.speed.eats.entity.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository extends MongoRepository<Menu, String> {
}
