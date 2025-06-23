package factoryMethod;

public interface ElevatorScheduler {
	int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
