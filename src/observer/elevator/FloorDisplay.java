package observer.elevator;

public class FloorDisplay implements Observer {

	private ElevatorController controller;

	public FloorDisplay(ElevatorController controller) {
		this.controller = controller;
	}


	@Override
	public void update() {
		System.out.println("[건물 각 층] 엘리베이터의 위치 : " + controller.getCurFloor());

	}
}
