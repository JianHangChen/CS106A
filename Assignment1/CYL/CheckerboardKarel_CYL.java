/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
/**
 * 先放置第一行beeper，该行最后一个位置时，检测左边有没有墙，该位置有没有beeper，如果有，
 * 下一行就先走一步再放置beeper，没有就不走一步。同理，走到另一边最后一个位置检测右边有没有墙，
 * 该位置有没有beeper...如此循环，若最后检测出有墙，就turnAround跳出循环。
 */
	public void run(){
		putBeeperInRow();
		while (leftIsClear()){
			if (beepersPresent()){
				repositionForRowToWest();
				move();
				putBeeperInRow();
			}
			else{
				repositionForRowToWest();
				putBeeperInRow();
			}
			if (rightIsClear()){
				if (beepersPresent()){
					repositionForRowToEast();
					move();
					putBeeperInRow();
				}
				else{
				repositionForRowToEast();
				putBeeperInRow();
				}
			}
			else{
				turnAround();
			}
		}
	}



/**
 * Put beepers in rows.
 */
	private void putBeeperInRow(){
		putBeeper();
		while (frontIsClear()){
			move();
			if (frontIsClear()){
				move();
				putBeeper();
			}
		}
	}



/**
 * Move from odd rows to even rows.
 */
	private void repositionForRowToWest(){
		if (leftIsClear()){
			turnLeft();
			move();
			turnLeft();
		}
	}

/**
 * Move from even rows to odd rows.
 */
	private void repositionForRowToEast(){
		if (rightIsClear()){
			turnRight();
			move();
			turnRight();
		}
	}

}