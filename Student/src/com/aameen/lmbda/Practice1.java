package com.aameen.lmbda;

public class Practice1 {
	
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
	public String getColor() {
		return color;
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
	public Practice1(String name, String color, String taste, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.taste = taste;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Practice1 [name=" + name + ", color=" + color + ", taste=" + taste + ", weight=" + weight + "]";
	}
	
	

}
