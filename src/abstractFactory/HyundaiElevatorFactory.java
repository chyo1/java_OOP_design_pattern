package abstractFactory;

public class HyundaiElevatorFactory extends ElevatorFactory {

	@Override
	public Motor createMotor() {
		return new HyundaiMotor();
	}

	@Override
	public Door createDoor() {
		return new HyundaiDoor();
	}
}
