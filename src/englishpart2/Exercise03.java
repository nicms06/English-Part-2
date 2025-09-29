/*
 * Design a program that asks the user to enter values for the length and height of a 
 * rectangle and then displays the area and perimeter of that rectangle.
 */

package englishpart2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		double length;
		double height;
		double area;
		double perimeter;
		
		// We ask the user for the length 
		System.out.print("Please input the length of the rectangle: ");
		
		//The machine waits for the value
		length = sc.nextDouble();
		
		// We ask the user for the length 
		System.out.print("Please input the height of the rectangle: ");
				
		//The machine waits for the value
		height = sc.nextDouble();
		
		//Calculate area and perimeter
		area = length * height;
		perimeter = (length*2.0) + (height*2.0);
		
		System.out.print("The area is " + area + " and the perimeter is " + perimeter);
		
		//Close the Scanner
		sc.close();
		
	}

}
