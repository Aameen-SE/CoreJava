package org.jn.aameen.array;
import java.util.Scanner;
import java.util.ArrayList;
public class MultiArrayList {

	public static void main(String[] args) {
		// multi dimensional in arraylist 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Value ");
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		//initialize 
		
		for(int i=0; i<3;i++)
		{
			list.add(new ArrayList<>());
		}
		
		// adding the element 
		
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				list.get(i).add(sc.nextInt());
			}
		}
		
		System.out.println(list);
	}

}
