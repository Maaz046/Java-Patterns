package strategy;

public class MallardDuck {
	
	QuackBehaviour quackBehaviour;
	FlyBehaviour flyBehaviour;
	
	public MallardDuck() {
		//You cannot create instances of a Java interface by itself. You must always 
		//create an instance of some class that implements the interface, and 
		//reference that instance as an instance of the interface.
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I am a real Mallard duck");
	}
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
}
