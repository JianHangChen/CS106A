
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
		
		double x = getWidth()/2 - FIGURE_WIDTH/2;
		double y = getHeight()/2 - FIGURE_HEIGHT/2;
		
		GRect rect = new GRect(x,y,FIGURE_WIDTH,FIGURE_HEIGHT);
		rect.setColor(Color.RED);
		rect.setFilled(true);
		add(rect);
		
		GOval oval = new GOval(x,y,FIGURE_WIDTH,FIGURE_HEIGHT);
		oval.setColor(Color.BLACK);
		oval.setFilled(true);
		oval.setFillColor(Color.GREEN);
		add(oval);
	}
	
	private static final double FIGURE_WIDTH = 500;
	private static final double FIGURE_HEIGHT = 300;

}
