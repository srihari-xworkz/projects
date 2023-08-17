package com.xworkz.datatransfer.dto;

import java.io.Serializable;

public class TheatreDTO implements Serializable {

	private String name;
	private int capacity;
	private double ticketPrice;
	private int rating;
	private boolean open;

	public TheatreDTO() {
		System.out.println("invoking no-arg constructor of TheatreDTO");
	}

	public TheatreDTO(String name, int capacity, double ticketPrice, int rating, boolean open) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.ticketPrice = ticketPrice;
		this.rating = rating;
		this.open = open;
	}

	@Override
	public String toString() {
		return "TheatreDTO [name=" + name + ", capacity=" + capacity + ", ticketPrice=" + ticketPrice + ", rating="
				+ rating + ", open=" + open + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

}
