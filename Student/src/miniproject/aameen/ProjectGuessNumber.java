package miniproject.aameen;

import java.util.Scanner;

public class ProjectGuessNumber {

	public static void main(String[] args) {
		// Creating a mini project where user need to  guess the number 
		
		
		int random = (int)(Math.random()*100);
		int userNum;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Guess the number within (1-100)");
			userNum = sc.nextInt();
			
			if(userNum==random) {
				System.out.println("Congratulation you guessed the correct number ");
				break;
			}
			else if(userNum>random) {
				System.out.println("The number  is too large \nTry Again \n");
			}
			else
				System.out.println("The  number is too small \nTry Again \n");
			
		}while(userNum>=0);
		
		System.out.println("The correct number is :"+random);
	}

}
