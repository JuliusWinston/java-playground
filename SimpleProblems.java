package projects;
/**
 * A collection of solutions to simple problems
 * 
 * @author Julius Winston
 *
 */

import java.util.Scanner;

public class SimpleProblems 
{
	/**
	 * Take all input from the standard input and write them to the standard output in reverse order
	 * 
	 * @return String reversedString
	 */
	public static String reversedString() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter mesage here");
		String stdInput = input.nextLine();//get string from std input
		input.close(); //prevent leaks
		
		String[] splitString = stdInput.split(" ");//split retrieved string of arrays (for every word)
		String reversedString = "";
		
		//reverse the string by concatenating elements in the split string array 
		//from the end of the array with a space in front of the element
		//(the last element in the array will not get the preceding space)
		for(int i = 0; i < splitString.length; i++) {
			reversedString +=  i != 0 ? " " + splitString[splitString.length - (i + 1)]
					: splitString[splitString.length - (i + 1)];
		}
		
		return reversedString;
	}
}
