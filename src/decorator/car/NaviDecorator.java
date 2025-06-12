package decorator.car;

public class NaviDecorator extends CarOptionDecorator {
	private int naviPrice;

	public NaviDecorator(CarComponent decoratedCar, int naviPrice) {
		super(decoratedCar);
		this.naviPrice = naviPrice;
	}

	@Override
	public int getPrice() {
		int price = super.getPrice();
		return price + naviPrice;
	}

	@Override
	public String getCarInfo() {
		String carInfo = super.getCarInfo();
		return carInfo + ", navi added";
	}
}
