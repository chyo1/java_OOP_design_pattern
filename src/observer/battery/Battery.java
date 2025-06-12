package observer.battery;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;
import observer.Subject;

public class Battery extends Subject {
	private int level = 100;
	private List<Observer> observers = new ArrayList<>();

	public void consume(int amount) {
		level -= amount;
		notifyObservers();
	}

	public int getLevel() {
		return level;
	}
}
