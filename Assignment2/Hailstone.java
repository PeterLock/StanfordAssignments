/*
 * File: Hailstone.java
 * Name: Peter Lock
 * Section Leader: Peter Lock
 * --------------------
 * Douglas Hofstadter's Pulitzer-prize-winning book Godel, Escher, Bach 
 * contains many interesting mathematical puzzles, many of which can be
 * expressed in the form of computer programs. In Chapter XII, Hofstadter
 * mentions a wonderful problem that is well within the scope of the 
 * control statements from Chapter 4. The problem can be expressed as
 * follows:
 * 
 * 		Pick some positive integer and call it n
 * 		If n is even, divide it by two
 * 		If n is odd, multiply it by three and add one.
 * 		Continue this process until n is equal to one.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {

		showMessage();
		
		doTheMath();
	
	}
	/* Method name: doTheMath()
	 * ------------------------
	 * This method runs tests to output the right number according to the Hailstone sequence.
	 * First we set a boolean value to true. Then we enter the while loop and run a test on the 
	 * number to see whether it is odd or even, and set the EVEN value accordingly. After that an
	 * if statement passes the number to either the method getEven or getOdd which in-turn returns
	 * the correct value to the println statement according to the Hailstone sequences calculator.
	 * precondition: The user must enter a number.
	 * postcondition: A message containing the results of the Hailstone operation are displayed
	 * to the screen.
	 */

	private void doTheMath() {

		int number = readInt("Enter a number: ");	
		println("");
		int container = 0;
		int count = 0;
		
		boolean EVEN = true;
		
		while(number !=1){
			EVEN = runEvenTest(number);
			count++;
			if(EVEN){
				container = number;
				number = getEven(number);
				println(container + " is even, so I take half: " + number);
			}
			else{
				container = number;
				number = getOdd(number);
				println(container + " is odd, so I make 3n+1: " + number);
			}			
		}
		println("");
		println("The process took " + count + " turns to reach 1.");
	}
	
	/* Method name: getEven()
	 * --------------------------------
	 * This method receives an integer from the calling method, divides that number by two and
	 * then returns the results to the calling method.
	 * precondition: Receives an integer from the calling method.
	 * postcondition: Returns the results.
	 */
	private int getEven(int number) {

		int container = 0;
		
		container = number / 2;
		
		return container;
	}
	
	/* Method name: getOdd()
	 * --------------------------------
	 * This method receives an integer from the calling method, multiplies it by three, adds
	 * one and then returns the results to the calling method.
	 * precondition: Receives an integer from the calling method.
	 * postcondition: Returns the results.
	 */
	private int getOdd(int number) {
		
		int container = 0;
		
		container = number * 3 + 1;
		
		return container;
	}
	
	/* Method name: runEvenTest()
	 * ------------------------------------
	 * This method test whether the number received is odd or even.
	 * precondition: Receives an integer from the calling method.
	 * postcondition: Returns a boolean true or false to the calling method
	 */
	private boolean runEvenTest(int number) {

		if(number % 2 == 0)
			return true;
		else 
			return false;
	}
	
	/* Method name: showMessage()
	 * --------------------------
	 * This method displays a simple explanation message of the program to the screen.
	 * Precondition: none
	 * Postcondition: Displays a message to the screen 
	 */
	private void showMessage() {
		println("This program shows the Hailstone Sequence and the "
				+ "number of turns it took to do.");
	}
}

