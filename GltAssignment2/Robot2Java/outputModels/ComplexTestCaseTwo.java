
public class ComplexTestCaseTwo extends RobotFrame {
	public ComplexTestCaseTwo(){}
	
	@Override
	protected void perform() {
		//#First build some scene
		
		//#How about a 3*3 scene?
		
		//#Then I should write 16 lines of code for building
		
		buildWall(2, 2);
		
		buildWall(2, 3);
		
		buildWall(2, 4);
		
		buildWall(3, 2);
		
		buildWall(3, 3);
		
		buildWall(3, 4);
		
		buildWall(4, 2);
		
		buildWall(4, 3);
		
		buildWall(4, 4);
		
		//#need some marks I guess
		
		dropMark(2, 2);
		
		dropMark(3, 3);
		
		dropMark(4, 4);
		
		//#Now we can play!
		
		//#First let the robot walk around
		
		while (!heading(Direction.south)) {
			turnLeftSub();
		}		
		//#Assume it is heading south and at 1,1
		
		step();
		
		step();
		
		step();
		
		//#well turn right is 3 time turn left
		
			for (int i=0; i < 3; i ++) {
			turnLeftSub();
			}
		
			for (int i=0; i < 3; i ++) {
			turnLeftSub();
			}
		
		step();
		
		step();
		
		step();
		
		while (!heading(Direction.east)) {
			turnLeftSub();
		}		
		//#Now back to the start position
		
		//#Now lets have some automatic running
		
		while (!wallAhead()) {
			drop();
			step();
		}		
		if (wallAhead() && heading(Direction.east)) {
			turnLeftSub();
			turnLeftSub();
			turnLeftSub();
		} 		
		//#put marks on all cells
		
		while (!wallAhead() && !isMark()) {
			drop();
			step();
		}		
		//#Do not want to play anymore
		
		//#destroy the walls
		
		destroyWall(2, 2);
		
		destroyWall(3, 3);
		
		pickMark(2, 2);
		
		//#Okay. too many walls
		
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
		ComplexTestCaseTwo script = new ComplexTestCaseTwo();
		script.initializeComponents();
		script.run();
	}
}