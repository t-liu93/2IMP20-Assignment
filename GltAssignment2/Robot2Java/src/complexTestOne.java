
public class complexTestOne extends RobotFrame {
	public complexTestOne(){}
	
	@Override
	protected void perform() {
		step();
		pick();
		traceMessage("so many commands");
		traceMessage("it is sizeable");
		traceMessage("good parser");
		
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