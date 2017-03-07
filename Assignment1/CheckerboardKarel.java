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
	public void run (){
		if(frontIsClear()){	 //normal case for nxN, n!=1
			fillOneRow();
			faceNorth();
			
			while(frontIsClear()){
				if(noBeepersPresent()){
					moveToNextRow(); //move from facing North, Post-position:  the beginning of Next row, facing East or West 
				}else{
					moveToNextRow();
					move();  // solve the even/odd problem
				}
				fillOneRow();
				faceNorth(); //let the Karel face North when finish
			}
			
		}else{ //the special case for 1xN
			turnLeft();
			fillOneRow();
		}
	}

	
	private void fillOneRow(){
		putBeeper();
		while(frontIsClear()){
			move();
			if(frontIsClear()){
				move();
				putBeeper();
			}
		}
	}
	
	private void moveToNextRow(){
		move();
		
		if (rightIsBlocked()){
			turnLeft();
		} else{
			turnRight();
		}
	}
	
	private void faceNorth(){ //let the Karel face North when finish
		if (facingEast()){  
			turnLeft();
		}
		if (facingWest()){
			turnRight();  
		}
	}
	
}
	

//cyl's version:




//my old program, very bad
/*public class CheckerboardKarel extends SuperKarel {

	public void run(){
		int moveStep=0;
		int lineNumber=0;
		while(true){
			if (lineNumber==0){
				putBeeper();
			}
			while(frontIsClear()){
				move();
				moveStep=1;
				if(frontIsClear()){	
					move();
					putBeeper();
					moveStep=2;
				}
			}
			

			
			if (facingEast()){
				if(leftIsBlocked()){
					break;
				}else{
					turnLeftAround();
					if(moveStep==2){
						move();
					}
					if(moveStep==0){
						lineNumber=1;
					}
				}
			}else{
				if(rightIsBlocked()){
					break;
				}else{
					turnRightAround();
					if(moveStep==2){
						move();
					}
					lineNumber=0;
				}
			}

		}
	}
	

	
	private void turnLeftAround(){
		turnLeft();
		if(frontIsClear()){
			move();
		}
		turnLeft();

	}
	
	private void turnRightAround(){
		turnRight();
		if(frontIsClear()){
			move();
		}
		turnRight();
	}
	
	
}
*/