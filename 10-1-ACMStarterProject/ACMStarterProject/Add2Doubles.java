/*
 * File: Add2Doubles.java
 * --------
 * This program add two doubles and prints their sum.
 */
import acm.program.*;

public class Add2Doubles extends ConsoleProgram {
	public void run(){
		println("This program adds two integers.");
		double n1 = readDouble("Enter n1: ");
		double n2 = readDouble("Enter n2: ");
		double total = n1 + n2;
		println("The total is " + total + ".");	
	}

}
