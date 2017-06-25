/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass checks for broken columns
 * and then proceeds to fix them.
 * 
 * Coded by : Peter Lock
 * Date: 2015/11/20
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	 
	public void run(){
				
		checkForRepairs();
		
		while(frontIsClear() == true){
			moveToTheNextColumn();
			checkForRepairs();
		}				
	}
		
	/*
	 * Move the robot to the next column.
	 */
	private void moveToTheNextColumn() {
				
		for(int x = 1; x<5; x++){
			move();
		}
	}

	/*
	 * Check whether the column needs to be repaired. Turn the robot left,
	 * check ahead for a wall. If there is no wall the robot will move forward
	 * placing a beeper when needed. The robot will stop when it reaches a wall.
	 */
	private void checkForRepairs() {

		turnLeft();
		
		if(noBeepersPresent() == true){
			putBeeper();
		}
		
		while( frontIsClear() == true){
			move();
			if(noBeepersPresent() == true){
				putBeeper();
			}
		}
		
		turnAround();
		while(frontIsClear() == true){
			move();
		}
		
		turnLeft();	
	}
			
}
