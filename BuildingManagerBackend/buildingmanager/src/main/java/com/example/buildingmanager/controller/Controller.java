package com.example.buildingmanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.buildingmanager.entity.Aidat;
import com.example.buildingmanager.entity.AllEntityCount;
import com.example.buildingmanager.entity.Building;
import com.example.buildingmanager.entity.Company;
import com.example.buildingmanager.entity.Complex;
import com.example.buildingmanager.entity.Outgoings;
import com.example.buildingmanager.entity.Rooms;
import com.example.buildingmanager.service.AidatService;
import com.example.buildingmanager.service.BuildingService;
import com.example.buildingmanager.service.CompanyService;
import com.example.buildingmanager.service.ComplexService;
import com.example.buildingmanager.service.OutgoingsService;
import com.example.buildingmanager.service.RoomsService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/")
public class Controller {

	private CompanyService companyService;
	private RoomsService roomService;
	private BuildingService buildingService;
	private AidatService aidatService;
	private ComplexService complexService;
	private OutgoingsService outgoingsService;

	public Controller(CompanyService companyService, RoomsService roomService, BuildingService buildingService,
			ComplexService complexService, OutgoingsService outgoingsService, AidatService aidatService) {
		this.companyService = companyService;
		this.roomService = roomService;
		this.buildingService = buildingService;
		this.aidatService = aidatService;
		this.complexService = complexService;
		this.outgoingsService = outgoingsService;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/companies")
	public List<Company> companies() {
		return companyService.findAllCompany();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/companies/count")
	public int findCountcompanies() {
		return companyService.findCountcompanies();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/company")
	public Optional<Company> findCompany(@RequestBody String id) {
		return companyService.findCompany(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/company/save")
	public Company saveCompany(@RequestBody Company company) {
		return companyService.saveCompany(company);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/company/deleteById")
	public void deleteCompanyById(@RequestBody String id) {
		companyService.deleteCompanyById(id);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/company/deleteByEntity")
	public void deleteCompanyById(@RequestBody Company company) {
		companyService.deleteCompanyByEntity(company);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/aidats")
	public List<Aidat> aidats() {
		return aidatService.aidats();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/aidat")
	public Optional<Aidat> findAidat(@RequestBody String id) {
		return aidatService.findAidat(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/aidat/save")
	public Aidat saveCompany(@RequestBody Aidat aidat) {
		return aidatService.saveAidat(aidat);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/rooms")
	public List<Rooms> rooms() {
		return roomService.rooms();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/rooms/count")
	public int findCountRooms() {
		return roomService.findCountRooms();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/room")
	public Optional<Rooms> findRoom(@RequestBody String id) {
		return roomService.findRooms(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/room/save")
	public Rooms saveRoom(@RequestBody Rooms room) {
		return roomService.saveBuilding(room);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/buildings/count")
	public int findCountBuildings() {
		return buildingService.findCountBuildings();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/buildings")
	public List<Building> findCoutbuildings() {
		return buildingService.buildings();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/building")
	public Optional<Building> findBuildings(@RequestBody String id) {
		return buildingService.findBuilding(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/building/save")
	public Building saveBuildings(@RequestBody Building building) {
		return buildingService.saveBuilding(building);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/outgoings")
	public List<Outgoings> outgoings() {
		return outgoingsService.outgoings();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/outgoing")
	public Optional<Outgoings> findOutgoings(@RequestBody String id) {
		return outgoingsService.findOutgoings(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/outgoing/save")
	public Outgoings saveOutgoings(@RequestBody Outgoings outgoings) {
		return outgoingsService.saveBuilding(outgoings);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/complexes")
	public List<Complex> complexes() {
		return complexService.complexes();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/complexes/count")
	public int findCountComplexes() {
		return complexService.findCountComplexes();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/complex")
	public Optional<Complex> findComplexes(@RequestBody String id) {
		return complexService.findComplex(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/complex/save")
	public Complex saveComplexes(@RequestBody Complex complex) {
		return complexService.saveComplex(complex);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/count")
	public AllEntityCount findCount() {

		AllEntityCount allEntityCount = new AllEntityCount();

		allEntityCount.setCompanyCount(companyService.findCountcompanies());
		allEntityCount.setComplexCount(complexService.findCountComplexes());
		allEntityCount.setBuildingCount(buildingService.findCountBuildings());
		allEntityCount.setRoomCount(roomService.findCountRooms());

		return allEntityCount;

	}

}
