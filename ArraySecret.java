/**
* File: ArraySecret.java
* Author: Eric Allen
* Date : 04/15/17
* Desription: A program to demonstrate storing information and recalling it in an array
*  - Asks for index that will display a secret message
*/

// Import Java classes
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// Class
public class ArraySecret {
	public static void main(String[] args) throws IOException {

		// Declare the array
		String[] messages = new String[5]; 
		
		//Assign messages to array
		messages [0] = "This is neat."; 
		messages [1] = "Think of how useful this could be";
		messages [2] = "Is this truely working?";
		messages [3] = "Gee, I hope you can read this";
		messages [4] = "Hello World??";

		// Variable to hold input value
		int item = 0;

		// New scanner for input by user
		Scanner scannerIn = new Scanner(System.in);

		// Prompt the user to enter number of online players
		System.out.println("Enter a number to see a hidden message (1-5):");	
        	item = scannerIn.nextInt();
	
		// Print the corresponding array item 
		item --;
		System.out.println(messages[item]);
	
	} 
}