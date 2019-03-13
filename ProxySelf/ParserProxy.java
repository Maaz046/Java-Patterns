package ProxySelf;

//The client/main interacts with the proxy which interacts with the Parser. The proxy
//does not instantiate the Parser class on it's own owing to the fact that instantiation
//woudl defeat the purpose of proxy as it would result in the heavy method being called.
//Instead it waits for a command from the client to run the heavy method when required
public class ParserProxy implements ParserInterface{
	Parser p;
	String book;
	public ParserProxy(String book) {
		this.book =  book;
	}

	@Override
	public void parseBook() {
		if(p == null)
			p = new Parser(book);
	}

	@Override
	public void displayTitle() {
		System.out.println("Title: "+book);
	}

	@Override
	public void getPrice() {
		System.out.println("Price: $280");
	}

}
