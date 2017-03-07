import stanford.karel.SuperKarel;
 
public class defendDemocracyKarel extends SuperKarel {
 
	public void run(){
		move();
		checkHole();
		while(frontIsClear()){
			move();
			if(frontIsClear()){
				move();
				checkHole(); //check the 3 cells of the hole, if cell!= 1, make it to 1, post-position: center of hole, facing east		
			}
		}
	}	
	private void checkHole(){ // if noBeepersPresent in any one of three cell, put every cell with 0 beeper; else stop 				
		if(noBeepersPresent()){
			moveNorth();//precondition: facing east;post-condition: facing east
			collectAllBeepers();
			moveSouth();//pre-condition: facing east, at the top of the hole; post-condition: facing east, at the south of the cell before
			moveSouth();
			collectAllBeepers();
			moveNorth();
		}else{
			moveNorth();
			if(noBeepersPresent()){
				moveSouth();
				collectAllBeepers();
				moveSouth();
				collectAllBeepers();
				moveNorth();
			}else{
				moveSouth();
				moveSouth();
				if(noBeepersPresent()){
					moveNorth();
					collectAllBeepers();
					moveNorth();
					collectAllBeepers();
					moveSouth();
				}else{
					moveNorth();
				}
			}
		}		
	}
	private void moveNorth(){
		turnLeft();
		move();
		turnRight();
	}
	private void moveSouth(){
		turnRight();
		move();
		turnLeft();
	}
	private void collectAllBeepers(){
		while(beepersPresent()){
			pickBeeper();
		}
	}
}
