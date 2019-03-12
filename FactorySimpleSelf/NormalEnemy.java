package FactorySimpleSelf;

public class NormalEnemy implements Enemy{
	private int damage;
	@Override
	public int damageDealt() {
		damage=30;
		return damage;
	}

	@Override
	public void diplay() {
		System.out.println("YOu have been dealt "+damage+" damage");
	}

}
