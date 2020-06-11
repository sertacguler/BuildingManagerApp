package com.example.buildingmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.buildingmanager.entity.Rooms;

@Repository
public interface RoomsRepository extends CrudRepository<Rooms, String> {

}
