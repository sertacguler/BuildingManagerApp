package com.example.buildingmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.buildingmanager.entity.Outgoings;

@Repository
public interface OutgoingsRepository extends CrudRepository<Outgoings, String> {

}
