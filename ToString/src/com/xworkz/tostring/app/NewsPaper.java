package com.xworkz.tostring.app;

public class NewsPaper {
	private String name;
	private int price;
	private int pages;
	private boolean hasArrived;
	private boolean read;
	
	@Override
	public String toString() {
		
		return "name: " + name +"\n"+ "price: " + price +"\n"+ "pages: " + pages +"\n"+ "hasArrived " + hasArrived +"\n"+ "read " + read;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getPages() {
		return pages;
	}
	
	public boolean hasArrived() {
		return hasArrived;
	}
	
	public boolean raed() {
		return read;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public void setHasArrived(boolean hasArrived) {
		this.hasArrived = hasArrived;
	}
	
	public void setRead(boolean read) {
		this.read = read;
	}
}
