package observer.battery;

import observer.Observer;

public class BatteryLevelDisplay implements Observer {

	private Battery battery;

	public BatteryLevelDisplay(Battery battery) {
		this.battery = battery;
	}

	public void update() {
		int level = battery.getLevel();
		System.out.println("level : " + level);
	}
}
