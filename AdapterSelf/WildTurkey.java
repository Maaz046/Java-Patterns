package AdapterSelf;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Gobble gobble gobble");
	}

	@Override
	public void fly() {
		for(int i=0 ; i<5 ; i++) {
			System.out.println("fly");
		}
	}

}
