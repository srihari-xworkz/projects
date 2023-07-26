package com.xworkz.tostring.app;

public class HeadSet {
	private boolean have;
	private String company;
	private int noOfHeadsets;
	private boolean bluetooth;
	private int range;
	
	@Override
	public String toString() {
		
		return "have: " + have +"\n"+ "company: " + company +"\n"+ "noOfHeadsets: " + noOfHeadsets +"\n"+ "bluetooth " + bluetooth +"\n"+ "range " + range;
	}
	
	public boolean have() {
		return have;
	}
	
	public boolean bluetooth() {
		return bluetooth;
	}
	
	public String getCompany() {
		return company;
	}
	
	public int getNoOfHeadsets() {
		return noOfHeadsets;
	}
	
	public int getRange() {
		return range;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setNoOfHeadsets(int noOfHeadsets) {
		this.noOfHeadsets = noOfHeadsets;
	}
	
	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	
	public void setHave(boolean have) {
		this.have = have;
	}
	
	public void setRange(int range) {
		this.range = range;
	}
}
