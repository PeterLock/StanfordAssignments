/*
 * File: FindRange.java
 * Name: Peter Lock	
 * Section Leader: Peter Lock
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {

		showMessage();
		
		beginCalculations();		

	}

	private void beginCalculations() {
	
		final int SENTINEL=0;
		
		int smallest=0;
		int largest=0;
		int userInput = 0;		
			
		userInput = readInt("? ");
		
		if(userInput==SENTINEL){
			println("smallest: " + smallest);
			println("largest: " + largest);
			println("The value is both the largest and the smallest.");	

		}
		else{
			smallest = userInput;
			
			while(userInput != SENTINEL){
				
				if(userInput < smallest){
					smallest = userInput;
				}
				
				if(userInput > largest){
					largest = userInput;
				}
				
				
			userInput = readInt("? ");
			}
			println("smallest is: " + smallest);
			println("largest is : " + largest);	
		}

	}

	/* Method name: showMessage
	 * This method simply displays a line of text to the screen
	 * precondition: none.
	 * postcondition: A message will have been displayed to the screen
	 */
	
	public void showMessage() {

		println("This program finds the largest and smallest numbers.");
		
	}

}