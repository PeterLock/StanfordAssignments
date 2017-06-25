/* File FixingBrokenJava.java
 * --------------------------
 * This program attempts to read a positive integer from the user,
 * then check whether that integer is prime (whether its only
 * divisors are 1 and itself).  If so, it prints a message saying
 * that the number is prime; otherwise it says that the number is
 * composite.
 * 
 * REMINDER:
 * 
 * A prime number is a whole number greater than 1, whose factors
 * are 1 and the number itself.
 * 
 * For example:
 * a) 12 is not a prime number as its factors are 1, 2, 3, 4, 6, and 12.
 * 
 * b) 11 is a prime number as its factors are 1 and 11
 * 
 * Coder: Peter Lock
 * Date: 2015/12/02
 */

import acm.program.*;

/* Class name: FixingBrokenJava
 * ----------------------------
 * This class contains syntax and logic errors. After the assignment is completed 
 * the class should be error free and contain no logic problems.
 */

public class FixingBrokenJava extends ConsoleProgram {
	
	/* Method name: run()
	 * ------------------
	 * Reads a number from the user and reports whether or not it is prime.
	 * precondition: none.
	 * postcondition: Prints the answer to the screen,
	 */
	public void run() {
		/* Get the value from the user. */
		int value = readPositiveInt();
		
		/* Check whether or not it is prime. */
		if (isPrime(value)) {
			println(value + " is prime.");
		} 
		else {
			println(value + " is not a prime number.");
		}
	}
	
	
	/* Method name: isPrime()
	 * --------------------
	 * Given a positive integer, returns whether that integer is prime.
	 * precondition: Receives the users input as a parameter to test.
	 * postcondition: Returns a boolean condition of TRUE or FALSE to the calling method.
	 */
	
	private boolean isPrime(int value) {
		
		/* Try all possible divisors of the number.  If any of them
		 * cleanly divide the number, we return that the number is
		 * not prime.
		 */
		
		int flag = 0;
		
		for(int x = 2; x < value; x++ ){
			if(value % x == 0){
				flag = 1;
				break;
			}
		}
		
		if(flag == 1){
			return false;
		}
		else{
			return true;
		}

	}
	
	/* Method name: readPositiveInt
	 * ----------------------------
	 * This method reads in a positive integer from the user and returns it to the calling method
	 * precondition: none
	 * postcondition: returns the number to the calling method after performing a test to make sure
	 * the number is positive or not. If the number is not positive the program reprompts the user.
	 * 
	 */
	private int readPositiveInt() {
		/* Get an initial value. */
		int value = readInt("Enter a positive integer: ");
		
		/* If the value is not positive, prompt the user again. */
		while (value <= 0) {
			value = readInt("The number must be a positive integer. Please enter another number.");
		}
		
		return value;
	}
}
