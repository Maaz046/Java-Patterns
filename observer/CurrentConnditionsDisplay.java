package observer;

	//How can you allow classes to communicate with each other without 
	//knowing which class they belong to? This is the beauty of this 
	//pattern. Since you are passing interfaces as arguments, the Observer
	//doesn't know which concrete class the updates are coming from.
	//Because in the observer constructor you're passing the Subject
	//interface rather than then Subject class
	
public class CurrentConnditionsDisplay implements Observer, DisplayElement{
	
	private float temp;
	private float humidity;
	private float heatIndex;
	//You could write private WeatherData wetaherData but it would be
	//a concrete class. What if you wanted to link an this Observer to a
	//subject that was not WeatherData rather some other class that
	//implemented Subject??
	private Subject weatherData;
	
	//You could write (WeatherData weatherData) but that would limit
	//it to just one class i.e WeatherData. What if there were other
	//classes that extended Subject?? And you wanted another instance of 
	//Observer to display from this new Subject??
	public CurrentConnditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions - Display: \n"+"Temperature(Deg C): "+temp+" \nHumidity: "+humidity+"\n"+"Heat Index: "+heatIndex+"\n\n");
	}
	
	//Update method is called by the Subject
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		heatIndex = temp*humidity/3;
		display();
		
	}
	
	
}
