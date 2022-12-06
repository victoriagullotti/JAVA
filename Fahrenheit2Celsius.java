/*
	NAME:       Viktoria Gullotti
	STUDENT ID: 131102666
	DATE:       12.02.2011
	
	ASSESSMENT 1 TASK 2
	
	TASK:       Converts temperature from Fahrenheit to Celsius
*/

import java.util.Scanner;

class Fahrenheit2Celsius {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		double tempF;
		double tempC;
		
		System.out.println("Please enter the temperature in Fagrenhert");
		tempF = sc.nextDouble();		

		tempC = tempF * 9 / 5 + 32;
		System.out.println("The temperature in Celsius is " + tempC + " degrees");
	}
}