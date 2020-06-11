package com.example.buildingmanager.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "ROOMS")
public class Rooms {

	@Id
	@Column(name = "roomid")
	public String roomid;

	@Column(name = "roomno")
	public String roomno;

	@Column(name = "roomowner")
	private String roomowner;

	@Column(name = "roomhirer")
	public String roomhirer;

	@Column(name = "buildingno")
	public String buildingno;

	@Column(name = "roomtype")
	public String roomtype;

	public String getRoomid() {
		return roomid;
	}

	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}

	public String getRoomno() {
		return roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	public String getRoomowner() {
		return roomowner;
	}

	public void setRoomowner(String roomowner) {
		this.roomowner = roomowner;
	}

	public String getRoomhirer() {
		return roomhirer;
	}

	public void setRoomhirer(String roomhirer) {
		this.roomhirer = roomhirer;
	}

	public String getBuildingno() {
		return buildingno;
	}

	public void setBuildingno(String buildingno) {
		this.buildingno = buildingno;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

}
