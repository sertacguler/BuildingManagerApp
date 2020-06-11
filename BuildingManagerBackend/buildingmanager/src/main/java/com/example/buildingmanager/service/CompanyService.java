package com.example.buildingmanager.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.buildingmanager.entity.Building;
import com.example.buildingmanager.entity.Company;
import com.example.buildingmanager.repository.CompanyRepository;

@Service
public class CompanyService {

	private CompanyRepository companyRepository;

	public CompanyService(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	public List<Company> findAllCompany() {
		return (List<Company>) companyRepository.findAll();
	}

	public Optional<Company> findCompany(String id) {
		return companyRepository.findById(id);
	}

	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}

	public void deleteCompanyById(String id) {
		companyRepository.deleteById(id);
	}

	public void deleteCompanyByEntity(Company company) {
		companyRepository.delete(company);
	}

	public int findCountcompanies() {
		List<Company> companies = (List<Company>) companyRepository.findAll();
		return companies.size();
	}

}