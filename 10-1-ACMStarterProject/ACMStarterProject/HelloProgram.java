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
	public void run(){
		GLabel msg = new GLabel("hello,world", 250,200);
		msg.setFont("Serif-58");//"Helvetica-50");
		msg.setColor(Color.MAGENTA);
		add(msg);
		//add(new GLabel("hello, world",100,100));
	}

}
