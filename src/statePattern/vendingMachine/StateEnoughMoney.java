package statePattern.vendingMachine;

public class StateEnoughMoney implements State {

	private VendingMachine machine;

	public StateEnoughMoney(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void drinkButton() {
		machine.useMoney(machine.getDrink().getPrice());
		machine.buyDrink();
		System.out.println("get Drink");
	}

	@Override
	public void returnButton() {
		System.out.println(machine.getMoney() + " returned");
		machine.setMoney(0);
		machine.setState(machine.getStateNoMoney());
	}

	@Override
	public void insertCoinButton(int money) {
		machine.insertCoin(money);
		System.out.println("input : " + money);
		System.out.println("total money : " + machine.getMoney());

		if (machine.getDrink().getStock() == 0) {
			machine.setState(machine.getStateNoStock());
		}
		else if (machine.getMoney() < machine.getDrink().getPrice()) {
			machine.setState(machine.getStateNotEnoughMoney());
		} else if (machine.getMoney() == 0) {
			machine.setState(machine.getStateNoMoney());
		}
	}
}
