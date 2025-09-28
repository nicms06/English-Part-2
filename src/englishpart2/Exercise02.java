/*
 * Implement a program that prompts for the user’s age and then attempts to work out the year in which the user was born.
 */

package englishpart2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
			
		//Create a new Scanner
		Scanner sc = new Scanner (System.in);
		
		//Declare the variable age
		int age;
		
		//Declare the variable month
		int month;
		
		//Declare the variable day
		int day;
	
		//We ask the user for his age 
		System.out.print("How old are you?: ");
		
		//The machine waits for an answer
		age = sc.nextInt();
		
		//We ask for the month he was born 
		System.out.print("What month were you born? (1 - 12): ");
		
		//The machine waits for an answer
		month = sc.nextInt();
		
		//We create a loop to ensure that a correct value is entered
		while(month < 1 || month >12) {
			
			System.out.print("The month must be between 1 and 2. Please, try again: ");
			month = sc.nextInt();
			
		}
		
		
		//Close the Scanner
		sc.close();

	}
	
}
