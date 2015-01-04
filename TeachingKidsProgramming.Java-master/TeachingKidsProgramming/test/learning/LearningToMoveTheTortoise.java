package learning;

import org.junit.Test;
import org.teachingextensions.logo.Tortoise;

public class LearningToMoveTheTortoise {

	@Test
	public void weCanMakeTheTortoiseMoveFiftySteps() {
		
		Tortoise.show();
		
		makeASquare();
		
		moveUpAndToTheRight();		
		
		makeASquare();
		
	}


	private void moveUpAndToTheRight() {
		Tortoise.move(200);
		Tortoise.turn(270);
	}
	
	
	private void makeASquare() {
		moveUpAndToTheRight();
		
		moveUpAndToTheRight();
		
		moveUpAndToTheRight();
		
		Tortoise.move(200);
	}
}
