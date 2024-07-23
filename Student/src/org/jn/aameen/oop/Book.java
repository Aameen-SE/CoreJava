package org.jn.aameen.oop;

public class Book {

	private double price;
	private String author;
	private int numPages;
	private int age ;
	
	public void setAuthor(String a) {
		author=a;
	}
	public String getAuthor() {
		return author;
	}
	
	public  void setvalue(double pr , String auth , int pages, int a){
		
		price=pr;
		author=auth;
		numPages=pages;
		age=a;
	}
		public void display() {
			System.out.print(" price :"+price +"\n author : "+author +"\n numPages :" +numPages +"\n");
			System.out.println("age : "+age);
		}
		
		public int getAge() {
			return age;
		}
}
