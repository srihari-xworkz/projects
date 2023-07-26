package com.xworkz.tostring.app;

public class Satellite {
	
	private String name;
	private String launchFrom;
	private int valuation;
	private boolean isSuccessfull;
	private String date;
	
	@Override
	public String toString() {
		
		return "name: " + name +"\n"+ "launchFrom: " + launchFrom +"\n"+ "valuation: " + valuation +"\n"+ "isSuccessfull " + isSuccessfull +"\n"+ "date " + date;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLaunchFrom() {
		return launchFrom;
	}

	public int getValuation() {
		return valuation;
	}
	
	public String getDate() {
		return date;
	}
	
	public boolean getisSuccessfull() {
		return isSuccessfull;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLaunchFrom(String launchFrom) {
		this.launchFrom = launchFrom;
	}
	
	public void setValuation(int valuation) {
		this.valuation = valuation;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setSuccessfull(boolean isSuccessfull) {
		this.isSuccessfull = isSuccessfull;
	}
}
