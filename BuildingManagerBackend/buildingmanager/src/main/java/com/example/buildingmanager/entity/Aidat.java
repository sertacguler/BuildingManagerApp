package com.example.buildingmanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "AIDAT")
public class Aidat {

	@Id
	@Column(name = "aidatid")
	public String aidatid;

	@Column(name = "aidatno")
	public String aidatno;

	@Column(name = "statement")
	private String statement;

	@Column(name = "account")
	public String account;

	@Column(name = "amount")
	public String amount;

	@Column(name = "deadline")
	public String deadline;

	@Column(name = "predate")
	public String predate;

	@Column(name = "roomno")
	public String roomno;

	public String getAidatid() {
		return aidatid;
	}

	public void setAidatid(String aidatid) {
		this.aidatid = aidatid;
	}

	public String getAidatno() {
		return aidatno;
	}

	public void setAidatno(String aidatno) {
		this.aidatno = aidatno;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getPredate() {
		return predate;
	}

	public void setPredate(String predate) {
		this.predate = predate;
	}

	public String getRoomno() {
		return roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

}
