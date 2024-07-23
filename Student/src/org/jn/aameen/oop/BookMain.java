package org.jn.aameen.oop;

public class BookMain {

	public static void main(String[] args) {
		
		// creating an object 
		
		Book book = new Book();
		
		
		book.setAuthor("Antonio");
		System.out.println("Authorname : "+book.getAuthor());
		
		
		
		// calling members method 
	
		book.setvalue(32.5, "Charles ", 100 , 32);
		book.display();
		
		int age=book.getAge();
		
		if(age<18)
			System.out.println("Kid");
		else
			System.out.println("Adult");
	
		
		
		
		
		
	}

}
