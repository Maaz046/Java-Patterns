package observerSelf;

import java.util.Observable;
import java.util.Random;

public class MyMain{

	public static void main(String[] args) {
		twitterEngine core = new twitterEngine();
		AnalyticsPage myPage = new AnalyticsPage(core);
//		Random r = new Random();
//		core.setValues(0, r.nextInt(2000)+100, r.nextInt(50000), r.nextInt(1000));
		Thread t = new Thread(core);
		t.start();
	}

}