package statePattern.vendingMachine;

public class StateNoMoney implements State {

	private VendingMachine machine;

	public StateNoMoney(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void drinkButton() {
		System.out.println("error : No money");
	}

	@Override
	public void returnButton() {
		System.out.println("error : No money");
	}

	@Override
	public void insertCoinButton(int money) {
		machine.insertCoin(money);
		System.out.println("input : " + money);

		if (machine.getDrink().getPrice() < machine.getMoney()) {
			machine.setState(machine.getStateEnoughMoney());
		} else {
			machine.setState(machine.getStateNotEnoughMoney());
		}

		System.out.println("total money : "  + machine.getMoney());
	}
}
