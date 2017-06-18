
public class Script extends RobotFrame {
	public Script(){}
	
	@Override
	protected void perform() {
		
			robotDSLEcore:Comment
		
			robotDSLEcore:Step
		
			robotDSLEcore:TurnLeft
		
			robotDSLEcore:Comment
		
			robotDSLEcore:IfStatement
		
			robotDSLEcore:Comment
		
			robotDSLEcore:IfStatement
		
			robotDSLEcore:Comment
		
			robotDSLEcore:WhileStatement
		
			robotDSLEcore:Comment
		
			robotDSLEcore:RepeatStatement
		
			robotDSLEcore:Comment
		
			robotDSLEcore:WhileStatement
		
			robotDSLEcore:Comment
		
			robotDSLEcore:Comment
		
			robotDSLEcore:IfStatement
		
			robotDSLEcore:Comment
		
			robotDSLEcore:WhileStatement
		
			robotDSLEcore:Comment
		
			robotDSLEcore:IfStatement
		
			robotDSLEcore:Comment
		
			robotDSLEcore:WhileStatement
		
			robotDSLEcore:Comment
		
			robotDSLEcore:Step
		
			robotDSLEcore:Step
		
			robotDSLEcore:Step
		
			robotDSLEcore:TurnLeft
		
			robotDSLEcore:TurnLeft
		
			robotDSLEcore:Drop
		
			robotDSLEcore:Pick
		
			robotDSLEcore:TraceMessage
		
			robotDSLEcore:TraceMessage
		
			robotDSLEcore:TraceMessage
		
			robotDSLEcore:WhileStatement
		
			robotDSLEcore:WhileStatement
		
			robotDSLEcore:WhileStatement
		
	}
	
	
	//Statement methods
	private void step() {
		if (canMove()) {
			moveRobot();
			pause();
		} else {
			reportError("Oops, There's a wall in front of me. I can't make a step forward.");
		}
	}
	
	//Main class
	public static void main(String[] args) {
		Script script = new Script();
		script.initializeComponents();
		script.run();
	}
}