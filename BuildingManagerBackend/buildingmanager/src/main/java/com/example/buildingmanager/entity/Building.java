package com.example.buildingmanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "BUILDING")
public class Building {

	@Id
	@Column(name = "buildingid")
	private String buildingid;

	@Column(name = "buildingno")
	public String buildingno;

	@Column(name = "buildingname")
	public String buildingname;

	@Column(name = "companyno")
	public String companyno;

	@Column(name = "roomcount")
	public String roomcount;

	@Column(name = "complexno")
	public String complexno;

	public String getBuildingid() {
		return buildingid;
	}

	public void setBuildingid(String buildingid) {
		this.buildingid = buildingid;
	}

	public String getBuildingno() {
		return buildingno;
	}

	public void setBuildingno(String buildingno) {
		this.buildingno = buildingno;
	}

	public String getBuildingname() {
		return buildingname;
	}

	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}

	public String getCompanyno() {
		return companyno;
	}

	public void setCompanyno(String companyno) {
		this.companyno = companyno;
	}

	public String getRoomcount() {
		return roomcount;
	}

	public void setRoomcount(String roomcount) {
		this.roomcount = roomcount;
	}

	public String getComplexno() {
		return complexno;
	}

	public void setComplexno(String complexno) {
		this.complexno = complexno;
	}

}
