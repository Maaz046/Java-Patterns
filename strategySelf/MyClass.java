package strategySelf;

//If this class implemented an interface directly then you'd have to
//hardcode the method here along with many other classes which may
//implement the interface. If a change in method was required you'd have
//manually make changes in all those classes.
public class MyClass extends MyAbstractClass{
	
	//You create an instance of the interface which is a class that
	//implements the interface. This way you get the functionality/methods
	//you desire in this class.
	//This makes maintaining the code easy. If you want to make changes to
	//a method in SayHelloManha interface, you can just change the SayHelloManha
	//class without classes using that interface knowing about it.
	public MyClass() {
		myinterface = new SayHelloManha();
	}

}
