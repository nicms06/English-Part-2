package englishpart2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Display the program title
		System.out.println("=== PRICE CALCULATOR WITH TAX ===");
		
		//Declare variable price
		double price;
		
		//Declare the variable finalPrice
		double finalPrice;
		
		//Declare the variable tax 
		double tax;
		
		//Display prompt for the price
		System.out.print("Input a price: ");
		
		//We ask to the user for a price
		price = sc.nextDouble();
		
		//Display prompt for the tax
		System.out.print("Input a tax: ");
		
		//We ask to the user for a tax
		tax = sc.nextDouble();
		
		//We add the tax to the price 
		finalPrice = price * (1 + tax/100);
		
		//We display the new price 
		System.out.print("The price with the tax is: " + finalPrice + " EUR");
		
		//Close the Scanner
		sc.close();
		
	}

}
