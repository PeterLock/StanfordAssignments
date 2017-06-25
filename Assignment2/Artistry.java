/*
 * File: Artistry.java
 * Name: Peter Lock
 * Section Leader: Peter Lock
 * ==========================================================
 * This program displays a drawing of a  nerds smilely face to
 * the screen.
 * 
 * REMEINDER:
 * 
 * Remember that you must have
 * 
 * 1. At most twenty GObjects,
 * 2. At least one filled object,
 * 3. At least two different colors of objects, and
 * 4. At least three different types of objects (not
 *    counting the GLabel you use to sign your name).
 * 
 * Also, be sure to sign your name in the bottom-right
 * corner of the canvas. eg: "Artistry by name"
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Artistry extends GraphicsProgram {
	public void run() {
			
		buildHead();
		addGlasses();
		addEyes();
		addMouth();
		addBody();
		addNose();
		addPants();
		addLegs();
		
		addArtistry();

	}
	/* Method name: addLegs
	 * --------------------
	 * This method adds a GRect to the canvas which will represent the images
	 * legs.
	 * precondition: none
	 * postcondition: Legs added to the canvas
	 */
	private void addLegs() {
		GRect leftLeg = new GRect(340, 555, 50, 20);
		leftLeg.setFilled(true);
		leftLeg.setColor(Color.BLUE);
		add(leftLeg);		
		
		GRect rightLeg = new GRect(410, 555, 50, 20);
		rightLeg.setFilled(true);
		rightLeg.setColor(Color.BLUE);
		add(rightLeg);	
	}
	/* Method name: addPants
	 * --------------------
	 * This method adds a GRect to the canvas which will represent the images
	 * pants.
	 * precondition: none
	 * postcondition: Pants added to the canvas
	 */
	private void addPants() {
		GRect pants = new GRect(340, 515, 120, 40);
		pants.setFilled(true);
		pants.setColor(Color.BLUE);
		add(pants);
	}
	/* Method name: addArtistry
	 * ------------------------
	 * This method adds the text "Artistry by Peter Lock" to the bottom right 
	 * corner of the canvas.
	 * precondition: none
	 * postcondition: The text is printed to the screen
	 */
	private void addArtistry() {
		GLabel artistry = new GLabel("Artistry by Peter Lock", 675, 750);
		add(artistry);
	}

	/* Method name: addNose
	 * --------------------
	 * This method adds a GLine to the canvas which will represent the images
	 * nose.
	 * precondition: none
	 * postcondition: Nose added to the canvas
	 */
	private void addNose() {
		
		/* REMINDER:
		 * 
		 * Usage: 	GLine gline = new GLine(x0, y0, x1, y1); 
		 * Parameters: 	
		 * 
		 *	x0  	The x-coordinate of the start of the line
		 *	y0  	The y-coordinate of the start of the line
		 *	x1  	The x-coordinate of the end of the line
		 *	y1  	The y-coordinate of the end of the line 
		 */
		GLine nose = new GLine(390, 300, 420, 300);
		add(nose);
	}

	/* Method name: addBody
	 * --------------------
	 * This method adds a GRects to the canvas which will represent the images
	 * body.
	 * precondition: none
	 * postcondition: Body added to the canvas
	 */
	private void addBody() {
		GRect body = new GRect(340, 445, 120, 70);
		body.setFilled(true);
		body.setColor(Color.PINK);
		add(body);
		
		GRect rightArm = new GRect( 450, 445, 50, 40);
		rightArm.setFilled(true);
		rightArm.setColor(Color.PINK);
		add(rightArm);
		
		GRect leftArm = new GRect(300, 445, 50, 40);
		leftArm.setFilled(true);
		leftArm.setColor(Color.PINK);
		add(leftArm);
	}
	
	/* Method name: addEyes
	 * --------------------
	 * This method adds a GOval to the canvas which will represent the images
	 * eyes.
	 * precondition: none
	 * postcondition: Eyes added to the canvas
	 */
	private void addEyes() {
		GOval eye1 = new GOval(255, 175, 110, 110);	
		GOval eye2 = new GOval(445, 175, 110, 110);	
		
		eye1.setFilled(true);
		eye2.setFilled(true);
		
		eye1.setColor(Color.BLACK);
		eye2.setColor(Color.BLACK);
		
		add(eye1);
		add(eye2);
	}
	
	/* Method name: addMouth
	 * --------------------
	 * This method adds a GOval to the canvas which will represent the images
	 * mouth.
	 * precondition: none
	 * postcondition: Mouth added to the canvas
	 */
	private void addMouth() {
		
		GOval mouth = new GOval(300, 350, 200, 100);
		mouth.setFilled(true);
		mouth.setColor(Color.RED);
		add(mouth);
		
	}
	/* Method name: addGlasses
	 * --------------------
	 * This method adds a GOval to the canvas which will represent the images
	 * glasses.
	 * precondition: none
	 * postcondition: Glasses added to the canvas
	 */
	private void addGlasses() {
		add(new GOval(230, 150, 160, 160));	
		add(new GOval(418, 150, 160, 160));	
		
		/*REMINDER:
		 * 
		 * Usage: 	GRect grect = new GRect(x, y, width, height); 
		 * Parameters: 	
		 * x  	The x-coordinate of the upper left corner
		 * y  	The y-coordinate of the upper left corner
		 * width  	The width of the rectangle in pixels
		 * height  	The height of the rectangle in pixels
		 */
		
		
		//left most sunglasses band
		GRect rect1 = new GRect(201, 220, 30, 10);
		rect1.setFilled(true);
		rect1.setColor(Color.BLACK);
		
		add(rect1);
		
		//right most sunglasses band
		GRect rect2 = new GRect(579, 220, 20, 10);
		rect2.setFilled(true);
		rect2.setColor(Color.BLACK);
		
		add(rect2);
		
		//right most sunglasses band
		GRect rect3 = new GRect(390, 220, 28, 10);
		rect3.setFilled(true);
		rect3.setColor(Color.BLACK);
		
		add(rect3);
	}

	private void buildHead() {
		GOval head = new GOval(200, 50, 400, 400);
		head.setFilled(true);
		head.setFillColor(Color.ORANGE);
		add(head);
	}
}
