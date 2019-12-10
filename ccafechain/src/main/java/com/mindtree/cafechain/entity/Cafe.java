package com.mindtree.cafechain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cafeshop")
public class Cafe {
	
	@Id
	private int cafeId;
	private String cafeName;
	private long cafeRevenue;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CafeManager cafeManager;

	public int getCafeId() {
		return cafeId;
	}

	public void setCafeId(int cafeId) {
		this.cafeId = cafeId;
	}

	public String getCafeName() {
		return cafeName;
	}

	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}

	public long getCafeRevenue() {
		return cafeRevenue;
	}

	public void setCafeRevenue(long cafeRevenue) {
		this.cafeRevenue = cafeRevenue;
	}

	public CafeManager getCafeManager() {
		return cafeManager;
	}

	public void setCafeManager(CafeManager cafeManager) {
		this.cafeManager = cafeManager;
	}

	@Override
	public String toString() {
		return "Cafe [cafeId=" + cafeId + ", cafeName=" + cafeName + ", cafeRevenue=" + cafeRevenue + ", cafeManager="
				+ cafeManager + "]";
	}

	public Cafe(int cafeId, String cafeName, long cafeRevenue, CafeManager cafeManager) {
		super();
		this.cafeId = cafeId;
		this.cafeName = cafeName;
		this.cafeRevenue = cafeRevenue;
		this.cafeManager = cafeManager;
	}

	public Cafe() {
		super();
		// TODO Auto-generated constructor stub
	}


}
