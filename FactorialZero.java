/*
	NAME:       Viktoria Gullotti
	STUDENT ID: 131102666
	DATE:       13.02.2011
	
	ASSESSMENT 1 TASK 4
	
	TASK:       Counts the number of trailing zeros at the end of factorial calculation
*/

import java.util.Scanner;

class FactorialZero {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int numberForCalc; 
		double rezult = 1; 
		double rezultCopy;
		int i = 1; 
		int zeroNumber = 0;
		
		System.out.println("Please enter the number for factorial calculation");
		numberForCalc = sc.nextInt();		
		
		//Factorial calculation
		while (i <= numberForCalc){
			rezult = rezult * i;
			i = i + 1;
		} 

		//Counting number of zeros in factorial rezult
		rezultCopy = rezult;
		while (rezultCopy%10 == 0.00){
			zeroNumber = zeroNumber + 1;
			rezultCopy = rezultCopy / 10;
		}
		
		System.out.println("The number " + rezult + " (" + numberForCalc + "!) has " + zeroNumber + " trailing zero(s)");
	}
}