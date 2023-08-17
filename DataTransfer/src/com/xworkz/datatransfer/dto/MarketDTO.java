package com.xworkz.datatransfer.dto;

import java.io.Serializable;

public class MarketDTO implements Serializable {
	private String area;
	private String type;
	private boolean metro;
	private boolean crowded;
	private boolean affordable;

	public MarketDTO() {
		System.out.println("no-arg constructor of MarketDTO");
	}

	public MarketDTO(String area, String type, boolean metro, boolean crowded, boolean affordable) {
		super();
		this.area = area;
		this.type = type;
		this.metro = metro;
		this.crowded = crowded;
		this.affordable = affordable;
	}

	@Override
	public String toString() {
		return "MarketDTO [area=" + area + ", type=" + type + ", metro=" + metro + ", crowded=" + crowded
				+ ", affordable=" + affordable + "]";
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isMetro() {
		return metro;
	}

	public void setMetro(boolean metro) {
		this.metro = metro;
	}

	public boolean isCrowded() {
		return crowded;
	}

	public void setCrowded(boolean crowded) {
		this.crowded = crowded;
	}

	public boolean isAffordable() {
		return affordable;
	}

	public void setAffordable(boolean affordable) {
		this.affordable = affordable;
	}

}
