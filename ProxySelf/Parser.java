package ProxySelf;

public class Parser implements ParserInterface{
	
	String book;
	
	//Here is our problem, The constructor contains a heavy method parseBook() which
	//takes 5 seconds to complete. This means every time a parser is instantiated this
	//long method is called. It's a design problem and the solution is to remove this
	//method from the constructor. However we are assuming that we cannot change this
	//code. To overcome this performance hurdle when can introduce a middle man class
	//which the client will interact with allow the client to run the heavy methods at
	//will, rather than at the mercy of the original Parser's constructor (which is heavy)
	public Parser(String book) {
		this.book = book;
		parseBook();
	}
	
	@Override
	public void parseBook() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Parsing complete");
	}

	@Override
	public void displayTitle() {
		System.out.println("Title: "+ book);
	}

	@Override
	public void getPrice() {
		System.out.println("Price: $280");
	}
}
