package singletonSelf;

public class Singleton {
	int a=1;
	int b=2;
	private static Singleton singleton;
	
	private Singleton(int a, int b) {
		this.a = a;
		this.b = b;
		int c = a*b;
		System.out.println(c);
	}
	
	public static Singleton getInstance() {
		if(singleton==null) {
			singleton =  new Singleton(1, 3);			
		}
		return singleton;
	}
}
