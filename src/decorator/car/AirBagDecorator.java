package decorator.car;

public class AirBagDecorator extends CarOptionDecorator {
	private int airBagPrice;

	public AirBagDecorator(CarComponent decoratedCar, int airBagPrice) {
		super(decoratedCar);
		this.airBagPrice = airBagPrice;
	}

	@Override
	public int getPrice() {
		int price = super.getPrice();
		return price + airBagPrice;
	}

	@Override
	public String getCarInfo() {
		String carInfo = super.getCarInfo();
		return carInfo + ", added airBag";
	}
}
