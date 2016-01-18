// Package name
package stdin;

// Import the Scanner class from the java.util package
import java.util.Scanner;

// Class definition of MainStdin
public class MainStdin {

	// Main method signature
	public static void main(String[] args) {
		
		// Print out "Please enter your name"
		System.out.println("Please enter your name.");
		
		// Create a new Scanner object, which will read user input,
		// and set it to a variable called 'reader' 
		Scanner reader = new Scanner(System.in);
		
		// Read the input from the user through the console
		String name = reader.nextLine();
		
		// Print out a message containing the string that was read from the user
		System.out.println("Hello " + name + ", hope you'll enjoy our class :)");
		
		// Method to close the reader
		reader.close();
	}
	
}
