package com.example.buildingmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.buildingmanager.entity.Complex;

@Repository
public interface ComplexRepository extends CrudRepository<Complex, String> {

}
