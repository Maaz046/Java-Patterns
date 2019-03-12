package Factory2Self;

public class SuperEnemy implements Enemy{
	
	private int damage;
	@Override
	public int damageDealt() {
		damage=70;
		return damage;
	}

	@Override
	public void diplay() {
		System.out.println("YOu have been dealt "+damage+" damage");
	}
}
