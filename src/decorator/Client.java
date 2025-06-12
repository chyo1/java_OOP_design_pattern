package decorator;

public class Client {

	public static void main(String[] args) {
		Display road = new RoadDisplay();
		road.draw();
		System.out.println("---------------------------------");

		LanDecorator roadWithLane = new LanDecorator(new RoadDisplay());
		roadWithLane.draw();
		System.out.println("---------------------------------");

		TrafficDecorator roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		roadWithTraffic.draw();

		System.out.println("---------------------------------");
		TrafficDecorator roadWithLandAndTraffic
				= new TrafficDecorator(new LanDecorator(new RoadDisplay()));
		roadWithLandAndTraffic.draw();
	}
}
