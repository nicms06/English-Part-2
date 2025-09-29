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
		
		//Declare the variable current year
		int currentYear;
		
		//Declare the variable year
		int year;
		
		//Create the variable monthPassed
		int monthPassed;
	
		//We ask the user for his age 
		System.out.print("How old are you?: ");
		
		//The machine waits for an answer
		age = sc.nextInt();
		
		//We ask the user what year is it
		System.out.print("What year is it?: ");
		currentYear = sc.nextInt();
		
		//Create a boolean to check if his birth month has passed
		System.out.print("Is your birth month over? (1 = yes , 2 = no): ");
		monthPassed = sc.nextInt();
		
		//We calculate the year of birth
		year = currentYear - age;
		
		//The logic of the exercise
		if (monthPassed == 1) {
			System.out.println("Your year of birth is " + year);
		}
		else if(monthPassed == 2) {
			System.out.println("Your year of birth is " + (year-1));
		}
		
		//Close the Scanner
		sc.close();

	}
	
}
