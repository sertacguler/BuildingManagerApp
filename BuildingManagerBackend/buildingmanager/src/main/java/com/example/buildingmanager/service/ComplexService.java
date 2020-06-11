package com.example.buildingmanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.buildingmanager.entity.Building;
import com.example.buildingmanager.entity.Company;
import com.example.buildingmanager.entity.Complex;
import com.example.buildingmanager.repository.ComplexRepository;

@Service
public class ComplexService {

	private ComplexRepository complexRepository;

	public ComplexService(ComplexRepository complexRepository) {
		this.complexRepository = complexRepository;
	}

	public List<Complex> complexes() {
		return (List<Complex>) complexRepository.findAll();
	}

	public Optional<Complex> findComplex(String id) {
		return complexRepository.findById(id);
	}

	public Complex saveComplex(Complex complex) {
		return complexRepository.save(complex);
	}

	public void deleteComplexById(String id) {
		complexRepository.deleteById(id);
	}

	public void deleteComplexByEntity(Complex complex) {
		complexRepository.delete(complex);
	}

	public int findCountComplexes() {
		List<Complex> complexes = (List<Complex>) complexRepository.findAll();
		return complexes.size();
	}

}
