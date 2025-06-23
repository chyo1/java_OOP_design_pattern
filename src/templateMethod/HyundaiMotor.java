package templateMethod;

import java.nio.file.OpenOption;

public class HyundaiMotor extends Motor {

	private Door door;
	private MotorStatus motorStatus;

	public HyundaiMotor(Door door) {
		super(door);
	}

	private void moveHyundaiMotor(Direction direction) {
		// move Hyundai motor
	}

	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING)
			return;

		DoorStatus doorStatus = door.getDoorStatus();
		if (doorStatus == DoorStatus.OPENED)
			door.close();

		moveHyundaiMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
}
