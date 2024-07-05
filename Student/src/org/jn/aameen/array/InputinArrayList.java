package org.jn.aameen.array;

import java.util.Scanner;
import java.util.ArrayList;


public class InputinArrayList {

	public static void main(String[] args) {
		// input of value in array list 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<5;i++)
		{
			list.add(sc.nextInt());
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(list.get(i));
		}

	}

}
