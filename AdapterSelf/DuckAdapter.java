package AdapterSelf;

public class DuckAdapter implements Turkey{
	
	Duck d;
	
	public DuckAdapter(Duck d) {
		this.d = d;
	}
	
	@Override
	public void gobble() {
		d.quack();
	}

	@Override
	public void fly() {
		d.fly();
	}

}
