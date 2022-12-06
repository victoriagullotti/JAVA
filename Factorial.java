/*
	NAME:       Viktoria Gullotti
	STUDENT ID: 131102666
	DATE:       12.02.2011
	
	ASSESSMENT 1 TASK 3
	
	TASK:       Factorial calculator
*/

import java.util.Scanner;

class Factorial {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int numberForCalc; //Factorial can be calculated only for integer numbers
		double rezult = 1; //The rezult can be too big for integer number, so use the double type
		int i = 1; 
		
		System.out.println("Please enter the number for factorial calculation");
		numberForCalc = sc.nextInt();		
		
		while (i <= numberForCalc){
			rezult = rezult * i;
			i = i + 1;
		} 
		System.out.println("The value of factorial " + numberForCalc + "! is " + rezult);
	}
}