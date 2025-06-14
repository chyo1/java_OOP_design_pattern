package decorator;

public class Client {

	public static void main(String[] args) {
		Display road = new RoadDisplay();
		road.draw();
		System.out.println("---------------------------------");

		LaneDecorator roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();
		System.out.println("---------------------------------");

		TrafficDecorator roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		roadWithTraffic.draw();

		System.out.println("---------------------------------");
		TrafficDecorator roadWithLandAndTraffic
				= new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLandAndTraffic.draw();
	}
}
