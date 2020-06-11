package com.example.buildingmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.buildingmanager.entity.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, String> {

}