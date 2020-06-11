package com.example.buildingmanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "COMPANY")
public class Company {

	@Id
	@Column(name = "companyid")
	private String companyid;

	@Column(name = "companyno")
	public String companyno;

	@Column(name = "companyname")
	public String companyname;

	@Column(name = "companyowner")
	public String companyowner;

	@Column(name = "companyaddress")
	public String companyaddress;

	@Column(name = "companyprice")
	public int companyprice;

	@Column(name = "companyphone")
	public String companyphone;

	public String getCompanyid() {
		return companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getCompanyno() {
		return companyno;
	}

	public void setCompanyno(String companyno) {
		this.companyno = companyno;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyowner() {
		return companyowner;
	}

	public void setCompanyowner(String companyowner) {
		this.companyowner = companyowner;
	}

	public String getCompanyaddress() {
		return companyaddress;
	}

	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}

	public int getCompanyprice() {
		return companyprice;
	}

	public void setCompanyprice(int companyprice) {
		this.companyprice = companyprice;
	}

	public String getCompanyphone() {
		return companyphone;
	}

	public void setCompanyphone(String companyphone) {
		this.companyphone = companyphone;
	}

}
