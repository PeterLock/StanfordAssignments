/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 * 
 * Coded by: Peter Lock
 * Cited: Matt Barackman
 * Date: 2015/11/21
 */

import acm.graphics.GRect;
import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run(){

		paintChessboard();
	
	}
	
	/* Method: paintChessboard
	 * 
	 * The highest abstract form of the problem.
	 * 
	 * pre-condition: none.
	 * 
	 * post-condition: Karel will have successfully completed the Checkerboard.
	 * 
	 */

	private void paintChessboard() {

		putBeeper();
		
		completeEastLine();
		
	}
	
	/* Method: completeEastLine
	 * 
	 * Karel completes the line heading Eastwards. 
	 * 
	 * pre-condition: Karel is facing East on a new line.
	 * 
	 * post-condition: Karel is either facing West on the next line or the program
	 * has finished.
	 * 
	 * 
	 * Note: completeEastLine and completeWestLine make use of mutual recursion
	 * to have Karel alternate rows to complete the board.
	 */

	private void completeEastLine() {
		
		alternate();
		
		turnLeft();
		
		if(frontIsClear()){
			startNewLine();
			turnLeft();
			completeWestLine();
		}
		
	}
	
	/* Method: completeWestLine
	 * 
	 * Karel completes the line heading Westwards.
	 * 
	 * pre-condition: Karel is facing West on a new line.
	 * 
	 * post-condition: Karel is either facing East on the next line or the program
	 * has finished.
	 * 
	 */

	private void completeWestLine() {

		alternate();
		turnRight();
		if(frontIsClear()){
			startNewLine();
			turnRight();
			completeEastLine();
		}
		
	}
	
	/* Method: startNewLine()
	 * 
	 * Karel starts a new line
	 * 
	 * pre-condition: Karel is at the end of either of the lines facing the 
	 * next row.
	 * 
	 * post-condition: Karel has now moved to the next line and has placed
	 * a beeper if needed.
	 * 
	 */

	private void startNewLine() {
		if(beepersPresent()){
			move();
		}
		else{
			move();
			putBeeper();
		}
	}
	
	/* Method: alternateToWall()
	 * 
	 * Alternate to the next wall. Putting a beeper on every second step.
	 * 
	 * pre-condition: Karel is either facing East or West at the beginning of
	 * a new line.
	 * 
	 * post-condition: Karel has now traversed the line and has in doing so
	 * placed beepers on every other square.
	 */

	private void alternate() {

		while(frontIsClear()){
			if(beepersPresent()){
				move();
			}
			else{
				move();
				putBeeper();
			}
		}
		
	}

	
}
