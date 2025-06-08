package statePattern.vendingMachine;

public interface State {

	void drinkButton();
	void returnButton();

	void insertCoinButton(int money);
}
