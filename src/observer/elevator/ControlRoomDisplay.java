package observer.elevator;

public class ControlRoomDisplay implements Observer {

	private ElevatorController controller;

	public ControlRoomDisplay(ElevatorController controller) {
		this.controller = controller;
	}

	@Override
	public void update() {
		System.out.println("[중앙통제실 ] 엘리베이터의 위치 : " + controller.getCurFloor());

	}
}
