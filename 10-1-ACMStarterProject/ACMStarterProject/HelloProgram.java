/*
 * File: HelloProgram.java
 * -------------
 * This program displays "hello, world" on the screen.
 * It is inspired by the first program in Brian
 * Kernighan and Dennis Ritchie's classic book,
 * The C Programming Language
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class HelloProgram extends GraphicsProgram{
	private static final double PI = 3.141592653;
	
	public void run(){
		
		GLabel msg = new GLabel("hello,world", 0,100);
		msg.setFont("Serif-Italic-58");//"Helvetica-50");
		msg.setColor(Color.MAGENTA);
		add(msg);
		
		//add(new GLabel("hello, world",100,100));
	}

}
