package strategySelf;

public abstract class MyAbstractClass {
	MyInterface myinterface;
	
	public void sayHello() {
		myinterface.hello();
	}
	
	public void smile() {
		System.out.println("Smile!!");
	}
	
}
