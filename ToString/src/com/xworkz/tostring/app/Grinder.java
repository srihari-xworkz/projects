package com.xworkz.tostring.app;

public class Grinder {
	private int watts;
	private int jars;
	private double volume;
	private int rpm;
	private String material;
	
	@Override
	public String toString() {
		
		return "watts" + watts +"\n"+ "jars: " + jars +"\n"+ "volume: " + volume +"\n"+ "rpm " + rpm +"\n"+ "material " + material;
	}
	
	public int getWatts() {
		return watts;
	}
	
	public int getJars() {
		return jars;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public int getRpm() {
		return rpm;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setWatts(int watts) {
		this.watts = watts;
	}
	
	public void setJars(int jars) {
		this.jars = jars;
	}
	
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
}
