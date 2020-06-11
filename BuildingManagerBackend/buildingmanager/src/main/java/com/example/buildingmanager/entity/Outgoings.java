package com.example.buildingmanager.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "OUTGOINGS")
public class Outgoings {

	@Id
	@Column(name = "outgoingsid")
	public String outgoingsid;

	@Column(name = "outgoingsno")
	public String outgoingsno;

	@Column(name = "statement")
	private String statement;

	@Column(name = "amount")
	public int amount;

	@Column(name = "paymentstatus")
	public String paymentstatus;

	@Column(name = "category")
	public String category;

	@Column(name = "predate")
	public Date predate;

	@Column(name = "datepaid")
	public Date datepaid;

	public String getOutgoingsid() {
		return outgoingsid;
	}

	public void setOutgoingsid(String outgoingsid) {
		this.outgoingsid = outgoingsid;
	}

	public String getOutgoingsno() {
		return outgoingsno;
	}

	public void setOutgoingsno(String outgoingsno) {
		this.outgoingsno = outgoingsno;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPaymentstatus() {
		return paymentstatus;
	}

	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getPredate() {
		return predate;
	}

	public void setPredate(Date predate) {
		this.predate = predate;
	}

	public Date getDatepaid() {
		return datepaid;
	}

	public void setDatepaid(Date datepaid) {
		this.datepaid = datepaid;
	}

}
