package Factory2Self;

public class Game1 extends Game {
//	EnemyFactory ef;
	Enemy enemy;	
	
	public Enemy createEnemy(String s) {
		if(s=="Normal") {
			enemy = new NormalEnemy();
		}
		
		else if (s=="Super") {
			enemy = new SuperEnemy();
		}		
		return enemy;
	}
}
