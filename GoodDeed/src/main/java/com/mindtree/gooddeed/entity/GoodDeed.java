package com.mindtree.gooddeed.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class GoodDeed {

	@Id
	@Column(name="deed_id")
	private int deedId ;
	
	@Column(name="deed_name")
	private String deedName;
	
	@OneToOne(mappedBy = "goodDeed")
	private Superviser superviser;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "gooddeed",fetch = FetchType.LAZY)
	private List<CampusMind> mind;
	
	public GoodDeed() {
		super();
	}
	public GoodDeed(int deedId, String deedName, Superviser superviser, List<CampusMind> mind) {
		super();
		this.deedId = deedId;
		this.deedName = deedName;
		this.superviser = superviser;
		this.mind = mind;
	}
	public GoodDeed(int deedId, String deedName) {
		super();
		this.deedId = deedId;
		this.deedName = deedName;
	}
	public GoodDeed(int deedId, String deedName, Superviser superviser) {
		super();
		this.deedId = deedId;
		this.deedName = deedName;
		this.superviser = superviser;
	}
	public GoodDeed(int deedId, String deedName, List<CampusMind> mind) {
		super();
		this.deedId = deedId;
		this.deedName = deedName;
		this.mind = mind;
	}
	public int getMid() {
		return deedId;
	}
	public void setMid(int deedId) {
		this.deedId = deedId;
	}
	public String getName() {
		return deedName;
	}
	public void setName(String deedName) {
		this.deedName = deedName;
	}
	public Superviser getSuperviser() {
		return superviser;
	}
	public void setSuperviser(Superviser superviser) {
		this.superviser = superviser;
	}
	public List<CampusMind> getMind() {
		return mind;
	}
	public void setMind(List<CampusMind> mind) {
		this.mind = mind;
	}
	
	
}
