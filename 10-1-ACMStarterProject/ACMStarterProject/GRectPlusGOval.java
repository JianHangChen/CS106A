
/*
 * File: GRectPlusGOval.java
 * ---------
 * This program is to display a filled rectangle and an oval using the same parameters.
 * Oval is outlined in black and filled in green.
 * Rectangle is created by a new GRect object, sets it to be filled,
 * color is red, and then displays it on the screen. The GRect is 
 * 125 pixels wide by 60 pixels high, with its upper left corner
 * at point (100,50)
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class GRectPlusGOval extends GraphicsProgram{
	
	public void run(){
		GRect rect = new GRect(100,50,125,60);
		rect.setColor(Color.RED);
		rect.setFilled(true);
		add(rect);
		
		GOval oval = new GOval(100,50,125,60);
		oval.setColor(Color.BLACK);
		oval.setFilled(true);
		oval.setFillColor(Color.GREEN);
		add(oval);
	}

}
