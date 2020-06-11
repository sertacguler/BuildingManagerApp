package com.example.buildingmanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.buildingmanager.entity.Aidat;
import com.example.buildingmanager.entity.Building;
import com.example.buildingmanager.repository.AidatRepository;

@Service
public class AidatService {

	private AidatRepository aidatRepository;

	public AidatService(AidatRepository aidatRepository) {
		this.aidatRepository = aidatRepository;
	}

	public List<Aidat> aidats() {
		return (List<Aidat>) aidatRepository.findAll();
	}

	public Optional<Aidat> findAidat(String id) {
		return aidatRepository.findById(id);
	}

	public Aidat saveAidat(Aidat aidat) {
		return aidatRepository.save(aidat);
	}

	public void deleteAidatById(String id) {
		aidatRepository.deleteById(id);
	}

	public void deleteAidatByEntity(Aidat aidat) {
		aidatRepository.delete(aidat);
	}

}
