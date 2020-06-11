package com.example.buildingmanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.buildingmanager.entity.Building;
import com.example.buildingmanager.entity.Complex;
import com.example.buildingmanager.entity.Outgoings;
import com.example.buildingmanager.repository.OutgoingsRepository;

@Service
public class OutgoingsService {

	private OutgoingsRepository outgoingsRepository;

	public OutgoingsService(OutgoingsRepository outgoingsRepository) {
		this.outgoingsRepository = outgoingsRepository;
	}

	public List<Outgoings> outgoings() {
		return (List<Outgoings>) outgoingsRepository.findAll();
	}

	public Optional<Outgoings> findOutgoings(String id) {
		return outgoingsRepository.findById(id);
	}

	public Outgoings saveBuilding(Outgoings outgoings) {
		return outgoingsRepository.save(outgoings);
	}

	public void deleteOutgoingsById(String id) {
		outgoingsRepository.deleteById(id);
	}

	public void deleteOutgoingsByEntity(Outgoings outgoings) {
		outgoingsRepository.delete(outgoings);
	}

}
