package ProxySelf;

public class MyMain {

	public static void main(String[] args) {
		ParserProxy pp = new ParserProxy("LalaLand");
		pp.displayTitle();
		pp.parseBook();
		pp.getPrice();
	}

}
