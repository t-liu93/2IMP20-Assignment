
public class Script extends RobotFrame {
	public Script(){}
	
	@Override
	protected void perform() {
		System.out.println("This is a test generator");
	}
	
	
	//Main class
	public static void main(String[] args) {
		Script script = new Script();
		script.initializeComponents();
		script.run();
	}
}