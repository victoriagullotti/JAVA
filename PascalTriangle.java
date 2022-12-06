/*
	NAME:       Viktoria Gullotti
	STUDENT ID: 131102666
	DATE:       17.02.2011
	
	ASSESSMENT 1 TASK 7
	
	TASK: To calculate a value for given possition in Pascal triangle     
*/

import java.util.Scanner;

class PascalTriangle {
	public static void main(String[] args) {
		int n; //Row number
		int k; //Column number
		double rezult = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter row number for calculation:");
		n = sc.nextInt();
		System.out.println("Please enter position number for calculation:");
		k = sc.nextInt();
		
		/*Checking if valid data were given for calculation*/
		if (k > n) {
	
			System.out.println("Not valid data were given for calculation. \nRow number CAN'T be bigger then column number!!!");
	
		} else {
		
			/*Calculations*/
			if (k == 0 || k == n ) { 
				//If the position number is first or last, we return 1
				rezult = 1;		

			} else if (k == 1 || k == n - 1) {
				//If the position number is first or last, we return row number
				rezult = n;		

			} else {
				//Ussing formula 
				rezult = calcFactorial(n) / (calcFactorial(k) * calcFactorial(n - k));
			}
			System.out.println("The value of Pascal triangle element (row number " + n + ", column number " 
									 + k + ") is " + rezult);
		}
	}

	public static double calcFactorial(int numberForCalc) {
		double rez = 1;
		int i = 1; 
		
		while (i <= numberForCalc) {
			rez = rez * i;
			i = i + 1;
		} 

		return rez;
	}
}