/*
 * File: Pyramid.java
 * Name: Peter Lock
 * Section Leader: Peter Lock
 * ------------------
 * This program draws a pyramid consisting of bricks arrange in horizontal
 * rows, so that the number of bricks in each row decreases by one as you 
 * move up the pyramid.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {
	
	public void run(){
	
		startBuilding();
		
	}
	/* Method name: startBuilding
	 * --------------------------
	 * This method calculates the position of each of the blocks of a pyramid
	 * and then calls the method drawBrick. The outer for loop controls 
	 * the y position while the inner for loop controls the x position.
	 * precondition: none
	 * postcondition: passes the x, and y position of each brick to draw
	 * on the screen to the method called drawBrick.
	 */
	private void startBuilding() {

		for( int row=0; row<BRICKS_IN_BASE; row++){
			
			int bricksInRow = BRICKS_IN_BASE - row;
			
			for(int brickNumber=0; brickNumber<bricksInRow; brickNumber++){
				
				int x = (getWidth()/2) - (BRICK_WIDTH*bricksInRow)/2 + brickNumber * BRICK_WIDTH;
				
				int y = getHeight() - BRICK_HEIGHT * (row+1);
				
				drawBrick(x, y);	
			}
			
		}
		
	}
	/* Method name: drawBrick
	 * ----------------------
	 * This method receives the x, and y position of each brick to draw,
	 * and paints the brick on the screen.
	 * precondition: Receives the x, and y position for each brick from the
	 * calling method.
	 * postcondition: Paints the brick on the canvas in the positions it
	 * received as parameters.
	 */

	private void drawBrick(int x, int y) {
		GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
		add(brick);
	}

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 40;

	/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 20;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 10;
}

