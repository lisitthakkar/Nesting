/*
 * Shaun Mbateng
 * Nesting
 * This program determines whether an input string is properly nested given some rules.
 * This program has an O(N) time complexity.
 */

import java.util.Scanner; //For User Inputs

public class Nesting
{
	public static void main(String[] args) 
	{
		String seq; //Sequence of Nucleotides
		Scanner kbd = new Scanner(System.in); //For Inputting String
		StringChecker Nesting = new StringChecker();
		
		//Enter Sequence
		System.out.print("Enter the String: ");
		seq = kbd.nextLine();
		kbd.close(); //No More Inputs Needed
		System.out.println();
		
		//Get and Print Result
		if (Nesting.propNested(seq))
			System.out.println("String is Properly Nested");
		else
			System.out.println("String isn't Properly Nested");
	}
}
