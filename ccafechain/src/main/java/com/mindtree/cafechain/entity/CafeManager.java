package com.mindtree.cafechain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="manager")
public class CafeManager {
	
	@Id
	private int managerId;
	private String managerName;
	private int managerSalary;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cafeManager")
	@JsonIgnore
	private List<Cafe> cafes;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public int getManagerSalary() {
		return managerSalary;
	}

	public void setManagerSalary(int managerSalary) {
		this.managerSalary = managerSalary;
	}

	public List<Cafe> getCafes() {
		return cafes;
	}

	public void setCafes(List<Cafe> cafes) {
		this.cafes = cafes;
	}

	@Override
	public String toString() {
		return "CafeManager [managerId=" + managerId + ", managerName=" + managerName + ", managerSalary="
				+ managerSalary + ", cafes=" + cafes + "]";
	}

	public CafeManager(int managerId, String managerName, int managerSalary, List<Cafe> cafes) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerSalary = managerSalary;
		this.cafes = cafes;
	}

	public CafeManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}