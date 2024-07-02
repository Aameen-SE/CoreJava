package org.jn.aameen.method;

public class MethodOverloading {

	public static void main(String[] args) {
		//Method overloading
		
		int add=sum(20,30,10);
		System.out.println("add :"+add);
		//Print();
		//System.out.println(Print("Aameen"));
		

	}
	static int sum(int a, int b) {
		return a+b;
	}
	
	static int sum(int a, int b,int c) {
		return a+b+c;
	}
	
	static void Print()
	{
		System.out.println("Print :1");
	}
	
	static String Print(String name) {
	
		return name;
	}

}
