package observer;

import java.util.ArrayList;

public class TrainData implements Subject{
	ArrayList<Observer> obs;
	float temp;
	float humidity;
	float pressure;
	
	
	@Override
	public void registerObserver(Observer o) {
		obs.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		obs.remove(o);
	}

	@Override
	public void notifyObserver() {
		for(Observer o : obs) {
			this.temp = temp;
			this.humidity = humidity;
			this.pressure = pressure;
			o.update(temp, humidity, pressure);
		}
	}
	
}
