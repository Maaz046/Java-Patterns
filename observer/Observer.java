package observer;

public interface Observer {
	
	//Bad move because if in the future the design was to change and more fields were to be added
	//We'd have to change the display method in every individual class hat implemented this interface
	
	public void update(float temp, float humidity, float pressure);

}
