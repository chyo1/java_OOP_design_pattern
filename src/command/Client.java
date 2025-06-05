package command;

public class Client {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);
		Button lampButton = new Button(lampOnCommand);
		lampButton.pressed();

		Alarm alarm = new Alarm();
		Command alarmStartCommand = new AlarmStartCommand(alarm);
		Button alarmButton = new Button(alarmStartCommand);
		alarmButton.pressed();

		alarmButton.setCommand(lampOnCommand);
		alarmButton.pressed(); // 램프 실행됨
	}
}
