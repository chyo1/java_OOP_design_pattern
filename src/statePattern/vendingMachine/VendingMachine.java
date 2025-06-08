package statePattern.vendingMachine;

public class VendingMachine {

	private State stateEnoughMoney;
	private State stateNotEnoughMoney;
	private State stateNoMoney;
	private State stateNoStock;
	private State state;

	private Drink drink;
	private int money;

	public VendingMachine(int stock, int price) {
		stateEnoughMoney = new StateEnoughMoney(this);
		stateNotEnoughMoney = new StateNotEnoughMoney(this);
		stateNoMoney = new StateNoMoney(this);
		stateNoStock = new StateNoStock(this);

		this.drink = new Drink(stock, price);
		this.money = 0;

		if (drink.getStock() > 0) {
			state = stateNoMoney;
		} else {
			state = stateNoStock;
		}
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void inputMoney(int money) {
		state.insertCoinButton(money);
	}

	public void returnMoney() {
		state.returnButton();
	}

	public void insertCoin(int money) {
		this.money += money;
	}

	public void useMoney(int price) {
		this.money -= price;
	}

	public void buyDrinkButton() {
		state.drinkButton();
	}

	public void buyDrink() {
		drink.setStock(drink.getStock() - 1);
	}

	public Drink getDrink() {
		return drink;
	}

	public int getMoney() {
		return money;
	}

	public State getStateEnoughMoney() {
		return stateEnoughMoney;
	}

	public State getStateNotEnoughMoney() {
		return stateNotEnoughMoney;
	}

	public State getStateNoMoney() {
		return stateNoMoney;
	}

	public State getStateNoStock() {
		return stateNoStock;
	}
}
