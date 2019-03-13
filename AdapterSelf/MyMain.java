package AdapterSelf;

public class MyMain {
	
	public static void main(String[] args) {
		
		Turkey turk = new WildTurkey();
		Duck turDuck  = new TurkeyAdapter(turk);
		
		turDuck.quack();
		turDuck.fly();
		
//		Duck duck = new MallardDuck();
//		DuckAdapter dapter = new DuckAdapter(duck);
//		
//		dapter.gobble();
		
	}

}
