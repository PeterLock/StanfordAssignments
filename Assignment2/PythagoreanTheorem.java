/*
 * File: PythagoreanTheorem.java
 * Name: Peter Lock
 * Section Leader: Peter Lock
 * Date: 2015/11/23
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {

	println("Enter values to compute the Pythagorean theorem.");
	
	double num1 = readDouble("a: ");
	double num2 = readDouble("b: ");
	
	num1 = num1 * num1;
	
	num2 = num2 * num2;
	
	double num3 = num1 + num2;
	
	double num4 = Math.sqrt(num3);
	
	println("c = " + num4);
		
	}
}
