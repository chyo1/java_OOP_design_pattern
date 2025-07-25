package observer.elevator;

import observer.elevator.Subject;

public class ElevatorController extends Subject {
	private int curFloor = 1;

	public void gotoFloor(int destination) {
		curFloor = destination;
		notifyObservers();
	}

	public int getCurFloor() {
		return curFloor;
	}
}
