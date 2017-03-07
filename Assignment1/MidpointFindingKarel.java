/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

/*public class MidpointFindingKarel extends SuperKarel {
	public void run(){
		while(frontIsClear()){
			moveEastTwoSteps(); //pre-condition: facing east; post-condition: facing east, move 1 or two steps
			moveNorthOneStep(); //pre-condition: facing east; post-condition: facing east, move 1 to North step
		}
		turnRight();// facing South
		while(frontIsClear()){
			moveSouthOneStep();// pre-condition: facing South; post-condition: facing South, move 1step
			moveWestOneStep(); // pre-condition: facing South; post-condition: facing South, move west 1 step
		}
		putBeeper();
	}
	
	private void moveEastTwoSteps(){
		move();
		if(frontIsClear()){
			move();
		}
	}
	
	private void moveNorthOneStep(){
		turnLeft();
		move();
		turnRight();
	}
	
	private void moveSouthOneStep(){ // pre-condition: facing South; post-condition: facing South, move 1step
		move();
	}
	
	private void moveWestOneStep(){ // pre-condition: facing South; post-condition: facing South, move west 1 step
		turnRight();
		move();
		turnLeft();
	}
}*/

// cyl


public class MidpointFindingKarel extends SuperKarel {
/**
 * 先放置一行beeper，然后检查这一行的beeper数目是否大于1，是就捡最远离中心的beeper，
 * 否就跳出循环，走到一边，然后走到最后一个beeper上面。
 */
	public void run(){
		putOneRow();
		turnAround();
		while (beepersMoreThanOne()){
			pickFarBeeper();
		}
		moveToWall();
		turnAround();
		while (noBeepersPresent()){
			move();
		}
	}

/**
 * Put beepers on the 1st Avenue.
 */
	private void putOneRow(){
		while (frontIsClear()){
			putBeeper();
			move();
		}
		putBeeper();
	}

/**
 * To decide whether the number of beepers 
 * on the Avenue is more than 1 or not.
 * precondition and postcondition:Karel faces east or west.
 */
	private boolean beepersMoreThanOne(){
		while (noBeepersPresent()){
			move();
		}
		if (frontIsBlocked()){
			turnAround();
			return (false);
		}
// At first, I didn't consider the size of the map,e.g. 1 or 2.
// Add an if statement can solve the problem.		
		else{
			move();
			if (beepersPresent()){
				moveToWall();
				return(true);
			}
			else {
				return (false);
			}
		}
	}
	
	private void moveToWall(){
		while (frontIsClear()){
			move();
		}
	}
	
/**
 * Pick a beeper which is the farthest from the center.
 */
	private void pickFarBeeper(){
		turnAround();
		while (noBeepersPresent()){
			move();
		}
		pickBeeper();
	}
	
}
