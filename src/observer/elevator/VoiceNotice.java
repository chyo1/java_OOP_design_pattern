package observer.elevator;

public class VoiceNotice implements Observer {

	private ElevatorController controller;

	public VoiceNotice(ElevatorController controller) {
		this.controller = controller;
	}

	@Override
	public void update() {
		System.out.println("[Ev 내 음성] 엘리베이터의 위치 : " + controller.getCurFloor());
	}
}
