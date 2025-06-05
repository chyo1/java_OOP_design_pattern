package statePattern;

public class ON implements State {

	private static ON on = new ON();

	public static ON getInstance() {
		return on;
	}
	@Override
	public void on_button_pushed(Light light) {
		System.out.println("no response");
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("statePattern.Light off");
		light.setState(OFF.getInstance());

	}
}
