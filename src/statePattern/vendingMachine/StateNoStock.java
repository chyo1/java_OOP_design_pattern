package statePattern.vendingMachine;

public class StateNoStock implements State {

	private VendingMachine machine;

	public StateNoStock(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void drinkButton() {
		System.out.println("Error : no stock");
	}

	@Override
	public void returnButton() {
		System.out.println(machine.getMoney() + " returned");
		machine.setMoney(0);
		machine.setState(machine.getStateNoMoney());
	}

	@Override
	public void insertCoinButton(int money) {
		System.out.println("Error : no stock");
	}
}
