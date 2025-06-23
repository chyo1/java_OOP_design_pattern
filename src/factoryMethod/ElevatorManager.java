package factoryMethod;

import java.util.ArrayList;
import java.util.List;

enum Direction {UP, DOWN}

public class ElevatorManager {

	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;

	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<>(controllerCount);
		for (int i = 0; i < controllerCount; i++) {
			ElevatorController controller = new ElevatorController(i);
			controllers.add(controller);
		}
		scheduler = new ThroughputScheduler();
	}

	void requestElevator(int destination, Direction direction) {
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
