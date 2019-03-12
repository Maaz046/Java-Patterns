package singletonSelf;

public class ChocBoiler {

	private boolean empty;
	private boolean boiled;
	ChocBoiler cb;

	private ChocBoiler() {
		empty = true;
		boiled = false;
	}

	public ChocBoiler getInstance() {
		if(cb==null) {
			cb = new ChocBoiler();
		}
		return cb;
	}

	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}


	public boolean isBoiled() {
		return boiled;
	}

}
