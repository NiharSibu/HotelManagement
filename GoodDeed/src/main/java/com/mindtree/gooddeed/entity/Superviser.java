package com.mindtree.gooddeed.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Superviser {

	@Id
	@Column(name="supId")
	private int supervisorID;
	
	@Column(name="supName")
	private String supervisorName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="GoodDeedId", referencedColumnName = "deed_Id")
	private GoodDeed goodDeed;
	
	
	public Superviser() {
		super();
	}
	public Superviser(int supervisorID, String supervisorName, GoodDeed goodDeed) {
		super();
		this.supervisorID = supervisorID;
		this.supervisorName = supervisorName;
		this.goodDeed = goodDeed;
	}
	public int getSupervisorID() {
		return supervisorID;
	}
	public void setSupervisorID(int supervisorID) {
		this.supervisorID = supervisorID;
	}
	public String getSupervisorName() {
		return supervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	public GoodDeed getGooddeed() {
		return goodDeed;
	}
	public void setGooddeed(GoodDeed gooddeed) {
		this.goodDeed = gooddeed;
	}	
	
}
