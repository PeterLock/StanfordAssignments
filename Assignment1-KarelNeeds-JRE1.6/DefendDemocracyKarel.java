
import stanford.karel.*;

public class DefendDemocracyKarel extends Karel {

	public void run(){
		while(frontIsClear()){
			runCheck();
		}
		runCheck();
				
	}

	private void runCheck() {
		
		if(beepersPresent()){
			move();
		}
		else{
			turnLeft();
			move();
			if(beepersPresent()){
				while(beepersPresent()){
					pickBeeper();
				}
			}
			turnAround();
			moveToMiddle();
			
			turnAround();
			turnLeft();
			move();
			
			if(beepersPresent()){
				while(beepersPresent()){
					pickBeeper();
				}
			}
			turnAround();		
			move();
			turnAround();
			turnLeft();
			if(frontIsClear()){
				move();
			}
		}	
	
	}

	private void moveToMiddle() {
		if(facingSouth()){
			move();
			turnLeft();
		}
		else{
			move();
			turnAround();
			
		}
	}

	private void turnAround() {
		turnLeft();
		turnLeft();
	}
	
}
