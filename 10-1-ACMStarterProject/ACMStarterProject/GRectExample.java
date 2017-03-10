/*
 * File: GRectExample.java
 * ---------
 * This program is to display a rectangle by a new GRect object, sets it to be filled,
 * color is Orange, and then displays it on the screen. The GRect is 
 * 125 pixels wide by 60 pixels high, with its upper left corner
 * at point (100,50)
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class GRectExample extends GraphicsProgram{
	
	public void run(){
		GRect msg = new GRect(100,50,125,60);
		msg.setColor(Color.RED);
		msg.setFilled(true);
		add(msg);
	}

}
