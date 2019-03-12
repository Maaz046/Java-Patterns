package FactorySimpleSelf;

public class EnemyFactory {
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
