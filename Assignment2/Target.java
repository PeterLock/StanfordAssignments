/*
 * File: Target.java
 * Name: Peter Lock
 * Section Leader: Peter Lock
 * -----------------
 * This program produces a logo for a national department store chain.
 * The program is simply three GOval objects, two red and one white, drawn
 * in the correct order.
 * 
 * REMINDER: 
 * 
 * The outer circle should have a radius of one inch (72 pixels).
 * The white circle has a radius of 0.65 inches.
 * The red circle has a radius of 0.3 inches.
 * 
 * 
 * To convert inches to pixels: 72 pixels/0.65 inches x 100 = n
 * 
 * The figure should be centered in the window of a GraphicsProgam subclass.
 * 	 
 * GOval REMINDER:
 * 
 * Usage: 	GOval goval = new GOval(x, y, width, height); 
 * Parameters: 	
 * x  	The x-coordinate of the upper left corner
 * y  	The y-coordinate of the upper left corner
 * width  	The width of the oval in pixels
 * height  	The height of the oval in pixels
 * 
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {

		outerCircle();
		
		middleCircle();
	
		innerCircle();
	}
	
	/* Method name: innerCircle
	 * ------------------------
	 * This method calculates the position of the inner circle in the 
	 * logo. Fist we get the width of the screen, half it to find the center
	 * then we subtract half of the inner circles radius to compensate for
	 * the offset. After that we have the (x) position for the circles container
	 * (which is a rectangle). Then do the same to find the y position.
	 * After that we paint the inner circle on the screen.
	 * precondition: none
	 * postcondition: Inner circle will be painted to the canvas in the 
	 * correct position.
	 * 
	 */
	private void innerCircle() {
		int x = getWidth()/2 - INNER_CIRCLE/2;
		int y = getHeight()/2 - INNER_CIRCLE/2;
		
		GOval outer = new GOval(x, y, INNER_CIRCLE, INNER_CIRCLE);
		outer.setFilled(true);
		outer.setColor(Color.RED);
		add(outer);		
	}
	/* Method name: middleCircle
	 * ------------------------
	 * This method calculates the position of the middle circle in the 
	 * logo. Fist we get the width of the screen, half it to find the center
	 * then we subtract half of the middle circles radius to compensate for
	 * the offset. After that we have the (x) position for the circles container
	 * (which is a rectangle). Then do the same to find the y position.
	 * After that we paint the middle circle on the screen.
	 * precondition: none
	 * postcondition: Middle circle will be painted to the canvas in the 
	 * correct position.
	 * 
	 */
	private void middleCircle() {
		int x = getWidth()/2 - CENTER_RADIUS/2;
		int y = getHeight()/2 - CENTER_RADIUS/2;
		
		GOval outer = new GOval(x, y, CENTER_RADIUS, CENTER_RADIUS);
		outer.setFilled(true);
		outer.setColor(Color.WHITE);
		add(outer);
	}
	
	/* Method name: outerCircle
	 * ------------------------
	 * This method calculates the position of the outer circle in the 
	 * logo. Fist we get the width of the screen, half it to find the center
	 * then we subtract half of the outer circles radius to compensate for
	 * the offset. After that we have the (x) position for the circles container
	 * (which is a rectangle). Then do the same to find the y position.
	 * After that we paint the outer circle on the screen.
	 * precondition: none
	 * postcondition: Outer circle will be painted to the canvas in the 
	 * correct position.
	 * 
	 */
	private void outerCircle() {

		int x = getWidth()/2 - OUTER_RADIUS/2;
		int y = getHeight()/2 - OUTER_RADIUS/2;
			
		GOval outer = new GOval(x, y, OUTER_RADIUS, OUTER_RADIUS);
		outer.setFilled(true);
		outer.setColor(Color.RED);
		add(outer);			
	}	
	private static final int OUTER_RADIUS=72;
	private static final int CENTER_RADIUS=72 * 64 / 100;
	private static final int INNER_CIRCLE=72 * 30 / 100;
}
