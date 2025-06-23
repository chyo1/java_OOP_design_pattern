package factoryMethod;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

enum Direction {UP, DOWN}

public class ElevatorManager {

	private List<ElevatorController> controllers;
	private SchedulingStrategyID strategyID;

	public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
		controllers = new ArrayList<>(controllerCount);
		for (int i = 0; i < controllerCount; i++) {
			ElevatorController controller = new ElevatorController(i);
			controllers.add(controller);
		}
		this.strategyID = strategyID;
	}

	void requestElevator(int destination, Direction direction) {
		ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
		System.out.println(scheduler);
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
