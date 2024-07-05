package org.jn.aameen.array;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// using array list 
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		System.out.println(list.contains(8));
		System.out.println(list);
		list.set(0, 99);
		
		System.out.println(list);
		
		

	}

}
