package command;

public class LampOffButton implements Command{

	private Lamp theLamp;

	public LampOffButton(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	@Override
	public void execute() {
		theLamp.turnOff();
	}
}
