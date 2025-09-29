/*
 * The following pseudocode has been arrived at for a program that converts pounds to kilos (1 kilo = 2.2 lb):
 * BEGIN
 * PROMPT for value in pounds
 * ENTER value in pounds
 * SET value to old value ÷ 2.2
 * DISPLAY value in kilos
 * END
 * Implement this program, remembering to declare any variables that are necessary.
 */

package englishpart2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variable pounds and kilos
		double pounds;
		double kilos;
		
		//We ask the user to input a value in pounds 
		System.out.print("How many pounds do you want to convert?: ");
		
		//The machine waits for an answer
		pounds = sc.nextDouble();
		
		//We calculate the kilos
		kilos = pounds / 2.2;
		
		//We show the value
		System.out.print(pounds + "pounds are " + kilos + " kilos.");
		
		//Close the Scanner
		sc.close();
		
	}

}
