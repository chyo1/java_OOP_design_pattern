package command.elevator;

public class ElevatorController {
	private int id;
	private int curFloor;

	public ElevatorController(int id) {
		this.id = id;
	}

	public void gotoFloor(int destination) {
		curFloor = destination;
		System.out.println("Ev " + id + " go to " + curFloor + " floor.");
	}
}
