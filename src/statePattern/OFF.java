package statePattern;

public class OFF implements State {

	private static OFF off = new OFF();

	public static OFF getInstance() {
		return off;
	}
	@Override
	public void on_button_pushed(Light light) {
		System.out.println("statePattern.Light on");
		light.setState(ON.getInstance());
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("no response");

	}
}
