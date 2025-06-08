package statePattern.vendingMachine;

public class Drink {

	private int price;
	private int stock;

	public Drink(int stock, int price) {
		this.stock = stock;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
