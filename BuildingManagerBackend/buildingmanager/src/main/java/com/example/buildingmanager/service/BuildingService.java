package com.example.buildingmanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.buildingmanager.entity.Aidat;
import com.example.buildingmanager.entity.Building;
import com.example.buildingmanager.repository.BuildingRepository;

@Service
public class BuildingService {

	private BuildingRepository buildingRepository;

	public BuildingService(BuildingRepository buildingRepository) {
		this.buildingRepository = buildingRepository;
	}

	public List<Building> buildings() {
		return (List<Building>) buildingRepository.findAll();
	}

	public Optional<Building> findBuilding(String id) {
		return buildingRepository.findById(id);
	}

	public Building saveBuilding(Building building) {
		return buildingRepository.save(building);
	}

	public void deleteBuildingById(String id) {
		buildingRepository.deleteById(id);
	}

	public void deleteBuildingByEntity(Building building) {
		buildingRepository.delete(building);
	}

	public int findCountBuildings() {
		List<Building> buildings = (List<Building>) buildingRepository.findAll();
		return buildings.size();
	}

}
