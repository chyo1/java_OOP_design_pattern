package abstractFactory;

public class Client {

	public static void main(String[] args) {
		Door lgDoor = DoorFactory.createDoor(VendorId.LG);
		Motor lgMotor = MotorFactory.createMotor(VendorId.LG);
		lgMotor.setDoor(lgDoor);

		lgDoor.open();
		lgMotor.move(Direction.UP);
	}

}
