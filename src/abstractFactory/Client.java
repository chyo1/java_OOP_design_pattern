package abstractFactory;

public class Client {

	public static void main(String[] args) {
//		Door hyundaiDoor = DoorFactory.createDoor(VendorId.HYUNDAI);
//		Motor hyundaiMotor = MotorFactory.createMotor(VendorId.HYUNDAI);
//		hyundaiMotor.setDoor(hyundaiDoor);
//
//		hyundaiDoor.open();
//		hyundaiMotor.move(Direction.UP);

		ElevatorFactory factory = null;
		String vendorName = args[0];
		if (vendorName.equalsIgnoreCase("LG"))
			factory = LGElevatorFactory.getInstance();
		else
			factory = HyundaiElevatorFactory.getInstance();
	}

}
