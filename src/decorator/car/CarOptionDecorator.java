package decorator.car;

public abstract class CarOptionDecorator extends CarComponent {
	private CarComponent decoratedCar;

	public CarOptionDecorator(CarComponent decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	public int getPrice() {
		return decoratedCar.getPrice();
	}

	public String getCarInfo() {
		return decoratedCar.getCarInfo();
	}
}
