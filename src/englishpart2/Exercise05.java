/*
 * An individual’s Body Mass Index (BMI) is a measure of a person’s weight in relation to their height. It is calculated as follows:
 * Divide a person’s weight (in kg) by the square of their height (in meters)
 */

package englishpart2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variables
		double weight;
		double height;
		double index;
		
		//We ask to the user for his weight
		System.out.print("Input your weight in kg: ");
		weight = sc.nextDouble();
		
		//We ask to the user for his height
		System.out.print("Input your height in meters: ");
		height = sc.nextDouble();
		
		//We calculate the Body Mass Index
		index = weight / (height*height);
		
		//We show the result
		System.out.printf("Your Body Mass Index is %.2f%n", index);
		
		//Close the Scanner
		sc.close();

	}

}
