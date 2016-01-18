
// This is a comment

/* 
 * This is a comment as well!
 */

// Specify which package in which this class exists in
package basic;

// public - specifies the class can be accessed publicly (by any other class) 
// class - specifies that it is the definition of a class
// MainBasic - the name of the class
public class MainBasic {

	// Static string that stores the value that will be printed in the console
	// Feel free to edit/change the text in the brackets " "
	public static String GLOBAL_STRING = "This is so awesome!!";
	
	// Main function that runs when you run the Java Class
	// It will execute the lines of code (from top to bottom) within the curly braces { }
	public static void main(String[] args) {
		
		// Command to print out text ("Cool Hello World!") to the console 
		System.out.println("Cool Hello World!");
			
		// Prints out the string stored in the GLOBAL_STRING variable, to the console 
		System.out.println(GLOBAL_STRING);
	}
	
}
