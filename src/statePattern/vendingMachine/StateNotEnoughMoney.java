package statePattern.vendingMachine;

public class StateNotEnoughMoney implements State {

	private VendingMachine machine;

	public StateNotEnoughMoney(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void drinkButton() {
		System.out.println("not enough money");
	}

	@Override
	public void returnButton() {
		System.out.println(machine.getMoney() + " returned");
		machine.setState(machine.getStateNoMoney());
		machine.setMoney(0);
	}

	@Override
	public void insertCoinButton(int money) {
		machine.insertCoin(money);
		System.out.println("input : " + money);
		System.out.println("total money : " + machine.getMoney());

		if (machine.getDrink().getPrice() <= machine.getMoney()) {
			machine.setState(machine.getStateEnoughMoney());
		}
	}
}
