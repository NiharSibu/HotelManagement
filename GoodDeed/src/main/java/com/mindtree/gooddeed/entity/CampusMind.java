package com.mindtree.gooddeed.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CampusMind {
	@Id
	@Column(name="Mid")
	private String mid;
	
	@Column(name="MindName")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="deedID",referencedColumnName = "deed_Id")
	private GoodDeed gooddeed;
	
	
	public CampusMind() {
		super();
	}
	public CampusMind(String mid, String name, GoodDeed gooddeed) {
		super();
		this.mid = mid;
		this.name = name;
		this.gooddeed = gooddeed;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GoodDeed getGooddeed() {
		return gooddeed;
	}
	public void setGooddeed(GoodDeed gooddeed) {
		this.gooddeed = gooddeed;
	}
	
	

}
