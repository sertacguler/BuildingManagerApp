package com.example.buildingmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.buildingmanager.entity.Aidat;

@Repository
public interface AidatRepository extends CrudRepository<Aidat, String> {

}
