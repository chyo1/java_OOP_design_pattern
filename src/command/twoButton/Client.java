package command.twoButton;

import command.Button;

public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		TwoButtonController twoButton = new TwoButtonController();

		Command command1 = new PowerCommand(tv);
		Command command2 = new PowerCommand(tv);

		twoButton.setCommand(command1, command2);
		twoButton.button1Pressed();
		twoButton.button2Pressed();
		twoButton.button1Pressed();
		twoButton.button1Pressed();
		twoButton.button2Pressed();
		twoButton.button1Pressed();
	}

}
