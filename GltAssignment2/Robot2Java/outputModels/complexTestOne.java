
public class complexTestOne extends RobotFrame {
	public complexTestOne(){}
	
	@Override
	protected void perform() {
		buildWall(3, 3);
		
		buildWall(2, 2);
		
		dropMark(4, 4);
		
		dropMark(5, 5);
		
		pickMark(4, 4);
		
		destroyWall(3, 3);
		
		//# simple steps
		
		step();
		
		turnLeftSub();
		
		drop();
		
		turnLeftSub();
		
		step();
		
		drop();
		
		pick();
		
		traceMessage("Test trace message");
		
		//#if conditional test
		
		if (heading(Direction.west)) {
			traceMessage("Heading west");
			turnLeftSub();
		} 		
		//#if with else
		
		if (heading(Direction.south)) {
			traceMessage("Heading south");
		} else {
			traceMessage("Not heading south");
			turnLeftSub();
		}		
		//#while loop test
		
		while (!isFull() && !wallAhead()) {
			drop();
		}		
		step();
		
		while (isMark()) {
			pick();
		}		
		while (wallAhead() && !heading(Direction.south)) {
			turnLeftSub();
		}		
		while (!heading(Direction.south) || !wallAhead()) {
			step();
		}		
		//#Turnleft
		
			for (int i=0; i < 3; i ++) {
			turnLeftSub();
			}
		
		traceMessage("so many commands");
		
		traceMessage("it is sizeable");
		
		traceMessage("good parser");
		
		while (!wallAhead()) {
			step();
		}		
	}
	
	
	//Some additional logical methods
	private boolean wallAhead() {
		return ! super.canMove();
	}
	
	//Statement methods
	//Step
	private void step() {
		if (canMove()) {
			moveRobot();
			pause();
		} else {
			reportError("Oops, There's a wall in front of me. I can't make a step forward.");
		}
	}
	//turnLeft
	private void turnLeftSub() {
		super.turnLeft();
		pause();
	}
	//Drop
	private void drop() {
		if (super.isFull()) {
			reportError("Oops, the current cell is full, I cannot drop more marks.");
		} else {
			super.addMark();
		}
		pause();
	}
	//Pick
	private void pick() {
		if (! isMark()) {
			reportError("There is no mark in this cell, I cannot pick up.");
		} else {
			super.removeMark();
		}
		pause();
	}
	//Trace message
	private void traceMessage(String msg) {
		super.trace(msg);
		pause();
	}
	
	//Build
	private void buildWall(int row, int col) {
		if (isAllowedRow(row) && isAllowedCol(col)) {
			addWall(row, col);
			minipause();
		} else {
			reportError("Attempted to build wall outside of the playground!");
		}	
	}
	
	//Destroy
	private void destroyWall(int row, int col) {
		if (isAllowedRow(row) && isAllowedCol(col)) {
			removeWall(row, col);
			minipause();
		} else {
			reportError("Attempted to destroy wall outside of the playground!");
		}
	}
	
	//Drop mark scene
	private void dropMark(int row, int col) {
		if (isAllowedRow(row) && isAllowedCol(col) && !isFull(row, col)) {
			addMark(row, col);
			minipause();
		} else if (isAllowedRow(row) && isAllowedCol(col) && isFull(row, col)) {
			reportError("Attempted to drop mark to a full cell!");
		} else {
			reportError("Attempted to drop mark out of the playground!");
		}
	}
	
	//Pick mark scene
	private void pickMark(int row, int col) {
		if (isAllowedRow(row) && isAllowedCol(col) && isMark(row, col)) {
			removeMark(row, col);
			minipause();
		} else if (isAllowedRow(row) && isAllowedCol(col) && !isMark(row, col)) {
			reportError("Attempted to pick mark from an empty cell!");
		} else {
			reportError("Attempted to pick mark out of the playground!");
		}
	}
	
	
	//Main class
	public static void main(String[] args) {
		complexTestOne script = new complexTestOne();
		script.initializeComponents();
		script.run();
	}
}