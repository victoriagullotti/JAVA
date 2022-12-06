/*
	NAME:       Viktoria Gullotti
	STUDENT ID: 131102666
	DATE:       17.02.2011
	
	ASSESSMENT 1 TASK 5
	  
*/

import java.util.Scanner;

class StringPermutation {
	static int counter = 0;
	
	public static void main(String[] args) {
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");	
		str = sc.next();
				
		permutation("", str);
	}

	public static void permutation(String strBegin, String strEnd) {
		if (strEnd.length() <= 1) {
			counter ++;
			System.out.println(counter+ "\t" + strBegin + strEnd);
		} else {
			for(int i = 0; i < strEnd.length(); i++) {
				permutation(strBegin + strEnd.charAt(i), 
								strEnd.substring(0, i) + strEnd.substring(i + 1));
			}
		}
	}
}