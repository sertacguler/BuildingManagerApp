package com.example.buildingmanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.buildingmanager.entity.Outgoings;
import com.example.buildingmanager.entity.Rooms;
import com.example.buildingmanager.repository.RoomsRepository;

@Service
public class RoomsService {

	private RoomsRepository roomsRepository;

	public RoomsService(RoomsRepository roomsRepository) {
		this.roomsRepository = roomsRepository;
	}

	public List<Rooms> rooms() {
		return (List<Rooms>) roomsRepository.findAll();
	}

	public Optional<Rooms> findRooms(String id) {
		return roomsRepository.findById(id);
	}

	public Rooms saveBuilding(Rooms rooms) {
		return roomsRepository.save(rooms);
	}

	public void deleteRoomsById(String id) {
		roomsRepository.deleteById(id);
	}

	public void deleteRoomsByEntity(Rooms rooms) {
		roomsRepository.delete(rooms);
	}

	public int findCountRooms() {
		List<Rooms> rooms = (List<Rooms>) roomsRepository.findAll();
		return rooms.size();
	}

}
