package AdapterSelf;

public class TurkeyAdapter implements Duck{
	
	Turkey turk;
	
	public TurkeyAdapter(Turkey turk) {
		this.turk = turk;
	}

	@Override
	public void quack() {
		turk.gobble();
	}

	@Override
	public void fly() {
		turk.fly();
	}

}
