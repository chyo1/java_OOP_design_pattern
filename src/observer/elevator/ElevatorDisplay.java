package observer.elevator;

public class ElevatorDisplay implements Observer {

	private ElevatorController controller;

	public ElevatorDisplay(ElevatorController controller) {
		this.controller = controller;
	}

	@Override
	public void update() {
		System.out.println("[Ev 내 화면] 엘리베이터의 위치 : " + controller.getCurFloor());
	}
}
