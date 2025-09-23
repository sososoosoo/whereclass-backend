package com.whereclass.repository;

import com.whereclass.model.Building;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends MongoRepository<Building, String> {
}