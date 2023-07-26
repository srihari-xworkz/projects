package com.xworkz.tostring.app;

public class Calculator {
	private String brand;
	private String typeOf;
	private String usage;
	private boolean isAllowed;
	private int operations;
	
	@Override
	public String toString() {
		return "brand: " + brand +"\n"+ "typeOf: " + typeOf +"\n"+ "usage: " + usage +"\n"+ "isAllowed " + isAllowed +"\n"+ "operations " + operations;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getTypeOf() {
		return typeOf;
	}
	
	public String getUsage() {
		return usage;
	}
	
	public int getOperations() {
		return operations;
	}
	
	public boolean isAllowed() {
		return isAllowed;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setTypeOf(String typeOf) {
		this.typeOf = typeOf;
	}
	
	public void setUsage(String usage) {
		this.usage = usage;
	}
	
	public void setAllowed(boolean isAllowed) {
		this.isAllowed = isAllowed;
	}
	
	public void setOperations(int operations) {
		this.operations = operations;
	}
}
