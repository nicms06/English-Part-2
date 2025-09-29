/*
 * A group of students has been told to get into teams of a specific size for their coursework. 
 * Design and implement a program that prompts for the number of students in the group and the size of the teams to be formed, 
 * and displays how many teams can be formed and how many students are left without a team.
 */

package englishpart2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variables
		int studentClass;
		int groupSize;
		int result;
		int noGroup;
		
		//We ask the user for the number of students in the class
		System.out.print("How many students there are in the class?: ");
		studentClass = sc.nextInt();
		
		//We ask for a size for the groups
		System.out.print("What is the size of the groups?: ");
		groupSize = sc.nextInt();
		
		//We calculate the result of the students in a group
		result = studentClass/groupSize;
		
		//We calculate the result of the students without a group
		noGroup = studentClass%groupSize;
		
		//We show the result
		System.out.println("There are " + result + " groups formed and " + noGroup + " do not have team group");
		
		//We close the Scanner
		sc.close();
		
	}

}
