package com.mindtree.departmentRegistration.entity;

import java.util.List;

public class Department {

	private int deptId;
	private String deptName;
	List<Employee> employee;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", employee=" + employee + "]";
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String deptName, List<Employee> employee) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.employee = employee;
	}

}
