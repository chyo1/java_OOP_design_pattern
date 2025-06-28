package abstractFactory;

enum Direction {UP, DOWN}
enum MotorStatus {MOVING, STOPPED}
public abstract class Motor {
	private MotorStatus motorStatus;
	private Door door;

	public Motor() {
		this.motorStatus = MotorStatus.STOPPED;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public void move(Direction direction) {
		if (motorStatus == MotorStatus.MOVING) return;
		if (door.getDoorStatus() == DoorStatus.OPENED) {
			door.close();
		}
		driveMotor();
		motorStatus = MotorStatus.MOVING;
	}

	protected abstract void driveMotor();
}
