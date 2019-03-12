package observer;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConnditionsDisplay ccd = new CurrentConnditionsDisplay(wd);
		TrainDisplay dd = new  TrainDisplay(wd);
		wd.setMeasurements(20,50,100);
		wd.setMeasurements(23,15,82);
		wd.setMeasurements(91,39,83);
	}
}
