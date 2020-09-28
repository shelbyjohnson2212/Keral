import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() {
		for(int i = 0; i < 6; i++ ) {
		move();
		if (noBeepersPresent()) {
			turnLeft();
			move();
			if(noBeepersPresent()) {
				turnLeft();
				turnLeft();
				move();
				move();
			} else {
				while(!noBeepersPresent()) {
					pickBeeper();
				}
				turnLeft();
				turnLeft();
				move();
				move();
			}
			if(noBeepersPresent()) {
				turnLeft();
				turnLeft();
				move();
				turnRight();
			} else {
				while(!noBeepersPresent()) {
					pickBeeper();
				}
				turnLeft();
				turnLeft();
				move();
				turnRight();
			}
		}
		move();
		};
	};
};