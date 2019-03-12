package observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	//You could give an argument of (CurrentConditionsDisplay ccd) as well
	//but that would reduce flexibility since your will be coupling with a
	//concrete class. You want to be able to register all Observer classes
	//that implement Observer interface and not just one class that implements
	//it. Hence you pass as an argument, the Interface rather than the concrete
	//class. Coupling with concrete classes is the source of problems.
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void removeObserver(Observer o) {
		int temp = observers.indexOf(o);
		observers.remove(temp);
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observers) {
			Observer obs = o;
			obs.update(temp, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
