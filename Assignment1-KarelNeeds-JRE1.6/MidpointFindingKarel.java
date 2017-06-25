
/* File: MidpointFindingKarel.java
 * -------------------------------
 * This program is designed to find the midpoint of any size space regardless 
 * of size. The problem solution should not use variables. It can only use the methods
 * available in the Karel.subclass and SuperKarel class.
 * 
 * Coded: Peter Lock
 * Date: 2015/11/22
 */

import stanford.karel.*;


public class MidpointFindingKarel extends SuperKarel {

	public void run() {
		
		findTheMiddle();
	}
	
	
	private void findTheMiddle() {

		layFoundation();
		
		pickUpBeepers();
		
		lastBeeper();
		
	}


	/* Drop a beeper onto each position in the row, except for the first and final 
	 * position.
	 */
	
	private void layFoundation() { 
		
		while (frontIsClear())	{
			move();
			putBeeper();
		}
		turnAround();
		pickBeeper();
		move();
	}
	
	/*  Move across the row checking for beepers, if a beeper has not been
	 *  found, move back Karel will move back to the previous position
	*/
	
	private void pickUpBeepers() { 
		if (beepersPresent()) {
			while (beepersPresent()) {
				move();
			}
			if (noBeepersPresent()) {
				turnAround();
				move();
				pickBeeper();
				move();
				pickUpBeepers();
			}
		}
	}
	
	/* The center has been found, so drop a beeper to show the user where the 
	 * center is.
	 */

	private void lastBeeper() { 
		turnAround();
		move();
		putBeeper();
	}
		

	/* Method: withMathematics
	 * Coded: Peter Lock
	 * Date: 2015/11/22
	 * 
	 * This method is used to perform a faster midpoint check when. The method
	 * does NOT satisfy the requirements of the assignment, as the assignment
	 * should not use variables to solve the problem
	 * 
	 * precondition: Karel is starting from the bottom left 0:0 position
	 * 
	 * postcondition: Karel is on or next to the midpoint.
	 */
	
	private void withMathematics() {

		int i = 0;
		int halfway = 0;
		
		for(i=1; frontIsClear()!=false; i++){
			move();
		}		
		
		turnAround();
		
		while(frontIsClear()){
			move();
		}
		
		turnAround();
		
		halfway = i/2;
		
		
		for(i=1; i<=halfway; i++){
			move();
		}
		
	}
	
}
