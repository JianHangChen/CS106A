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
 * �ȷ��õ�һ��beeper���������һ��λ��ʱ����������û��ǽ����λ����û��beeper������У�
 * ��һ�о�����һ���ٷ���beeper��û�оͲ���һ����ͬ���ߵ���һ�����һ��λ�ü���ұ���û��ǽ��
 * ��λ����û��beeper...���ѭ��������������ǽ����turnAround����ѭ����
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