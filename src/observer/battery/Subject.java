package observer.battery;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void dettach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}
}
