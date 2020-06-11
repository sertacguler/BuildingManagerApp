package com.example.buildingmanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "COMPLEX")
public class Complex {

	@Id
	@Column(name = "complexid")
	private String complexid;

	@Column(name = "complexno")
	private String complexno;

	@Column(name = "complexname")
	private String complexname;

	@Column(name = "buildingcount")
	private String buildingcount;

	@Column(name = "companyno")
	private String companyno;

	public String getComplexid() {
		return complexid;
	}

	public void setComplexid(String complexid) {
		this.complexid = complexid;
	}

	public String getComplexno() {
		return complexno;
	}

	public void setComplexno(String complexno) {
		this.complexno = complexno;
	}

	public String getComplexname() {
		return complexname;
	}

	public void setComplexname(String complexname) {
		this.complexname = complexname;
	}

	public String getBuildingcount() {
		return buildingcount;
	}

	public void setBuildingcount(String buildingcount) {
		this.buildingcount = buildingcount;
	}

	public String getCompanyno() {
		return companyno;
	}

	public void setCompanyno(String companyno) {
		this.companyno = companyno;
	}

}
