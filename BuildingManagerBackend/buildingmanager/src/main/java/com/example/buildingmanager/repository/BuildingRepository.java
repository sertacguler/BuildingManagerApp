package com.example.buildingmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.buildingmanager.entity.Building;

@Repository
public interface BuildingRepository extends CrudRepository<Building, String> {

}
