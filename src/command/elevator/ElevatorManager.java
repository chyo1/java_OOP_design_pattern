package command.elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;

	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<>(controllerCount);
	}

	public void addController(ElevatorController controller) {
		controllers.add(controller);
	}

	public void requestElevator(int destination, Direction direction) {
		int id = selectElevator(destination, direction);
		ElevatorController controller = controllers.get(id);
		controller.gotoFloor(destination);
	}

	private int selectElevator(int destination, Direction direction) {
		return 0;
	}
}
