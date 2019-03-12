package Factory2Self;

public abstract class Game {
	
Enemy enemy;
	
	public void startGame(String s) {
		enemy = createEnemy(s);
		enemy.damageDealt();
		enemy.diplay();
	}
	
	abstract Enemy createEnemy(String s);

}
