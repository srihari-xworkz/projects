package com.xworkz.datatransfer.dto;

public class PilotDTO {

	private String name;
	private boolean license;
	private int age;
	private String rank;
	private double salary;

	public PilotDTO() {
		System.out.println("no-arg const of Pilot");
	}

	public PilotDTO(String name, boolean license, int age, String rank, double salary) {
		super();
		this.name = name;
		this.license = license;
		this.age = age;
		this.rank = rank;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PilotDTO [name=" + name + ", license=" + license + ", age=" + age + ", rank=" + rank + ", salary="
				+ salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLicense() {
		return license;
	}

	public void setLicense(boolean license) {
		this.license = license;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
