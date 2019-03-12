package FactorySimpleSelf;

public class MyMain {
	
	public static void main(String[] args) {
		EnemyFactory ef = new EnemyFactory();
		Game1 g1 = new Game1(ef);
		g1.startGame("Normal");
	}
	
}
