/*
	NAME:       Viktoria Gullotti
	STUDENT ID: 131102666
	DATE:       13.02.2011
	
	ASSESSMENT 1 TASK 6
	
	TASK:       Calculation of the Fibonacci number between two numbers inclusive

				   F_n = F_{n-1} + F_{n-2} 
*/

import java.util.Scanner;

class Fibonacci {
	public static void main (String[] arg){
		Scanner sc = new Scanner(System.in);
		int numberBegin;
		int numberBetween;
		int numberEnd;
		
		System.out.println("Please enter the begin number:");
		numberBegin = sc.nextInt();
		System.out.println("Please enter the end number:");
		numberEnd = sc.nextInt();
		
		numberBetween = numberEnd - numberBegin;
		System.out.println("The Fibonassi number between " + numberBegin 
								 + " and " + numberEnd + " is " + numberBetween);
	

	}
}
