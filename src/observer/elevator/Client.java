package observer.elevator;

public class Client {

	public static void main(String[] args) {
		ElevatorController controller = new ElevatorController();
		ControlRoomDisplay controlRoomDisplay = new ControlRoomDisplay(controller);
		ElevatorDisplay elevatorDisplay = new ElevatorDisplay(controller);
		FloorDisplay floorDisplay = new FloorDisplay(controller);
		VoiceNotice voiceNotice = new VoiceNotice(controller);

		controller.attach(elevatorDisplay);
		controller.attach(voiceNotice);
		controller.attach(floorDisplay);
		controller.attach(controlRoomDisplay);

		controller.gotoFloor(5);
		System.out.println("---------------------------------");
		controller.gotoFloor(10);
	}

}
