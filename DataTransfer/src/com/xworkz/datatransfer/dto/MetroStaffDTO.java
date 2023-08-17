package com.xworkz.datatransfer.dto;

import java.io.Serializable;

public class MetroStaffDTO implements Serializable {

	private String empName;
	private double salary;
	private String branch;
	private int workHours;
	private int count;

	public MetroStaffDTO() {
		System.out.println("no-arg const of MetroStaffDTO");
	}

	public MetroStaffDTO(String emoName, double salary, String branch, int workHours, int count) {
		super();
		this.empName = emoName;
		this.salary = salary;
		this.branch = branch;
		this.workHours = workHours;
		this.count = count;
	}

	@Override
	public String toString() {
		return "MetroStaffDTO [empName=" + empName + ", salary=" + salary + ", branch=" + branch + ", workHours="
				+ workHours + ", count=" + count + "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
