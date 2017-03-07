/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */


// cyl's version
/*import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run(){
		while (frontIsClear()) {
		    OneLine();
		    moveToNextLine();
		}
		OneLine();
	} 
	
    *//**
     * 1 Finish one line's work.
     *//*
	private void OneLine(){
		turnLeft();
	    putOneLineBeepers();
	    turnAround();
	    moveToWall();
	    turnLeft();
	}
	    

	*//**
	* 1.1 Puts a consecutive line of beepers. 
	*//*
	private void putOneLineBeepers() {
		while (frontIsClear()){
			if (noBeepersPresent()) {
			       putBeeper();
		           move();
		    }
			else{
				move();
			}
		}
		
        if (noBeepersPresent()) {
		       putBeeper();
	    }
	}
	
	
	*//**
	* 1.2 Moves Karel forward until it is blocked by a wall.
	*//*
	private void moveToWall()
	{
	  while (frontIsClear()) {
	      move();
	  }
	}


    *//**
     * 2 Moves 4 steps to the next line.
     *//*
    private void moveToNextLine()
    {
	    move();
	    move();
	    move();
	    move();
    }

}*/


// my version



import stanford.karel.*;


public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run(){
		addBeeper();
		turnLeft();
		moveToWall();
		turnRight();
		
		while(frontIsClear()){
			moveSteps(4);
			if (leftIsClear()){
				turnLeft();
				moveToWall();
				turnRight();
			}
			else{
				turnRight();
				moveToWall();
				turnLeft();
			}
		}
				
		if (frontIsClear()){
			moveSteps(4);
		}
		turnRight();
		moveToWall();
		turnLeft();
		
		if (frontIsClear()){
			moveSteps(4);
		}

		turnLeft();
		moveToWall();
		turnRight();
		if (frontIsClear()){
			moveSteps(4);
		}
		turnRight();
		moveToWall();
		turnLeft();
		
		if (frontIsClear()){
			moveSteps(4);
		}
		
	}
	private void moveToWall(){
		while (frontIsClear()){
			addBeeper();
			move();
		}
	}
	
	private void moveSteps(int a){
		for(int i=0; i<a; i++){
			if (frontIsClear()){
				move();
			}
		}
	}
	
	private void addBeeper(){
		if (noBeepersPresent()){
			putBeeper();
		}
	}
	
}

/*	private void reverseBeeper(){
		if (beepersPresent()) {
			pickBeeper();
		}
		else{
			putBeeper();
		}
	
}*/