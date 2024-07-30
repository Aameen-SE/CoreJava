package com.aameen.lmbda;

public class Fruit {
	
	private String name;
	private String color;
	private String taste;
	private double weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// constructor 
	public Fruit(String name, String color, String taste, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.taste = taste;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", taste=" + taste + ", weight=" + weight + "]";
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
