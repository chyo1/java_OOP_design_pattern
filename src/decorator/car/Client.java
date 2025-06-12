package decorator.car;

public class Client {

	public static void main(String[] args) {
		BasicCar basicCar = new BasicCar(1000);
		System.out.println(basicCar.getCarInfo() + " " + basicCar.getPrice());

		AirBagDecorator carWithAirBag = new AirBagDecorator(basicCar, 500);
		System.out.println(carWithAirBag.getCarInfo() + " " + carWithAirBag.getPrice());

		ESCDecorator carWithAirBagAndESC = new ESCDecorator(new AirBagDecorator(basicCar, 500), 200);
		System.out.println(carWithAirBagAndESC.getCarInfo() + " " + carWithAirBagAndESC.getPrice());

		NaviDecorator naviDecorator = new NaviDecorator(new NaviDecorator(new ESCDecorator(basicCar, 100), 200), 100);
		System.out.println(naviDecorator.getCarInfo() + " " + naviDecorator.getPrice());

	}

}
