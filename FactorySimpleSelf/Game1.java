package FactorySimpleSelf;

public class Game1 {
	EnemyFactory ef;
	Enemy enemy;
	
	public Game1(EnemyFactory ef) {
		this.ef = ef;		
	}
	
	public void startGame(String s) {
		enemy = ef.createEnemy(s);
		enemy.damageDealt();
		enemy.diplay();
	}	
}
