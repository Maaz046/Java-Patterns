package observer;

public class TrainDisplay implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private float heatIndex;
	private Subject trainData;
	
	public TrainDisplay(Subject trainData) {
		this.trainData = trainData;
		trainData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Train-Display: \n"+"Temperature(Deg C): "+temp+" \nHumidity: "+humidity+"\n"+"Heat Index: "+heatIndex+"\n\n");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		heatIndex = temp*humidity/3;
		display();
	}
	
}
