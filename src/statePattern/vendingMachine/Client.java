package statePattern.vendingMachine;

public class Client {

	public static void main(String[] args) {

		VendingMachine machine = new VendingMachine(5, 1000);

		machine.inputMoney(1000);
		machine.inputMoney(500);
		machine.buyDrinkButton();
		machine.returnMoney();
		machine.inputMoney( 1000);
		machine.inputMoney(1000);
		machine.buyDrinkButton();
	}
}
