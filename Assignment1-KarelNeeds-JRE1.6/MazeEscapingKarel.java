/**
 * File name: MazeEscapingKarel.java
 * ---------------------------------
 * This program demonstrates a compacted form of the right hand rule for
 * a program to escape from a maze.
 * 
 * Programmer: Peter Lock
 * Date: 2015/12/18
 */

import stanford.karel.*;

public class MazeEscapingKarel extends SuperKarel {
	
	public void run(){
		
		getOut();

	}

	/**
	 * Method name: getOut
	 * -------------------
	 * This method uses the right hand rule to escape from a maze.
	 */
	private void getOut() {

		while (noBeepersPresent()) {
	          turnRight();
	          while (frontIsBlocked()) {
	             turnLeft();
	          	}
	          move();		
		}

	}
}
