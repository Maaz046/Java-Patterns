package observerSelf;

import java.util.ArrayList;
import java.util.Random;

public class twitterEngine implements Subject, Runnable{
	private ArrayList<Observer> observerList;
	private static int userID=0;
	private int tweetCount;
	private int followers;
	private int retweets;
	Random r = new Random();
	
	public twitterEngine() {
		observerList = new ArrayList<>();
	}
	
	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void remove(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObserver() {
		
		for(Observer o : observerList) {
			o.update(userID, tweetCount, followers, retweets);
		}
	}
	
	public void setValues(int userID, int tweetCount, int followers, int retweets) {
		twitterEngine.userID= userID;
		this.tweetCount=tweetCount;
		this.followers=followers;
		this.retweets=retweets;
		notifyObserver();
		
	}
	
	@Override
	public void run() {
		for(;;) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setValues(userID, r.nextInt(2000)+100, r.nextInt(50000), r.nextInt(1000));
			twitterEngine.userID++;
		}
	}

}
