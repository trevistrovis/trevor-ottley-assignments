package com.trevor.fruityloops;

public class Item {
	
	private String name;
	private double price;
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	

}
