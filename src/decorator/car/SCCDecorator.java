package decorator.car;

public class SCCDecorator extends CarOptionDecorator {
	private int sccPrice;

	public SCCDecorator(CarComponent decoratedCar, int sccPrice) {
		super(decoratedCar);
		this.sccPrice = sccPrice;
	}

	@Override
	public int getPrice() {
		int price = super.getPrice();
		return price + sccPrice;
	}

	@Override
	public String getCarInfo() {
		String carInfo = super.getCarInfo();
		return carInfo + ", sccPrice added";
	}
}
