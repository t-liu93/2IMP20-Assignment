
public class complexTestOne extends RobotFrame {
	public complexTestOne(){}
	
	@Override
	protected void perform() {
		//# simple steps
		
		step();
		
		step();
		
		step();
		
		step();
		
		step();
		
		//#if conditional test
		
		if (heading(Direction.east)) {
			turnLeftSub();
			turnLeftSub();
			turnLeftSub();
		} 		
		//#if with else
		
		if (!isFull()) {
			drop();
			drop();
			drop();
			drop();
		} else {
			pick();
			pick();
		}		
		//#while loop test
		
		while (!isFull() && heading(Direction.south)) {
			drop();
			drop();
		}		
		while (isMark()) {
			pick();
		}		
		//#Turnleft
		
			for (int i=0; i < 3; i ++) {
			turnLeftSub();
			}
		
		//#With some extension features
		
		//#both not
		
		if (!isFull() && !isMark()) {
			drop();
		} 		
		//#one not at front
		
		while (!wallAhead() && !isFull()) {
			step();
			traceMessage("go one step");
		}		
		//#one not at rear
		
		if (!isMark() && !isFull()) {
			drop();
		} 		
		//#both true
		
		while (wallAhead() && heading(Direction.west)) {
			turnLeftSub();
		}		
		//#Another list of commands
		
		turnLeftSub();
		
		turnLeftSub();
		
		drop();
		
		pick();
		
		traceMessage("so many commands");
		
		traceMessage("it is sizeable");
		
		traceMessage("good parser");
		
		while (isFull()) {
			turnLeftSub();
		}		
		while (!wallAhead()) {
			step();
			step();
			step();
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
		if (super.getCurrentCell().getMarks() == 0) {
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
	
	
	//Main class
	public static void main(String[] args) {
		complexTestOne script = new complexTestOne();
		script.initializeComponents();
		script.run();
	}
}