/*
	NAME:       Viktoria Gullotti
	STUDENT ID: 131102666
	DATE:       10.02.2011
	
	ASSESSMENT 1 TASK 1
*/

//import java.util.Scanner;
import javax.swing.JOptionPane;
	
class NumberConverter {
	public static void main (String[] args){
		Object[] options = {"Decimal to Binary",
  	 		                 "Binary to Decimal", " "};
								  
		int n = JOptionPane.showOptionDialog( null, "Plese chose the way for the corvertation: ",
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
				    null,
			    options,
			    options[2]);

/*
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a name of animal: ");	
		word1 = sc.next();
		System.out.println("Please enter another a noun for a place: ");	
		word2 = sc.next();
		System.out.println("Please enter a past-tense verb: ");	
		word3 = sc.next();
		System.out.println("Please enter a noun: ");	
		word4 = sc.next();

		System.out.println("One day, a " + word1 + " went to " + word2 
								 + " and " + word3 + " a " + word4 + ".");	
		*/
	}
}