package command.elevator;

public class Client {

	public static void main(String[] args) {
		ElevatorController controller1 = new ElevatorController(1);
		ElevatorController controller2 = new ElevatorController(2);

		ElevatorManager em = new ElevatorManager(2);
		em.addController(controller1);
		em.addController(controller2);

		DestinationSelectionCommand destinationSelectionCommand1stController
				= new DestinationSelectionCommand(1, controller1);

		ElevatorButton destinationButton1stFloor
				= new ElevatorButton(destinationSelectionCommand1stController);
		destinationButton1stFloor.pressed();

		DestinationSelectionCommand destinationSelectionCommand2ndController
				= new DestinationSelectionCommand(2, controller2);

		ElevatorButton destinationButton2ndFloor
				= new ElevatorButton(destinationSelectionCommand2ndController);
		destinationButton2ndFloor.pressed();

		ElevatorRequestCommand requestDownCommand
				= new ElevatorRequestCommand(2, Direction.DOWN, em);
		ElevatorButton requestDownFloorButton2ndFloor = new ElevatorButton(requestDownCommand);
		requestDownFloorButton2ndFloor.pressed();

	}

}
