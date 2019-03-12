package observerSelf;

public class AnalyticsPage implements Observer{
	private int tweetCount;
	private int followers;
	private int retweets;
	private int userID;
	
	public AnalyticsPage(Subject sub) {
		sub.register(this);
	}
	
	@Override
	public void update(int a, int b, int c, int d) {
		userID=a;
		tweetCount=b;
		followers=c;
		retweets=d;
		display();
	}

	@Override
	public void display() {
		System.out.println("UserID: "+ userID );
		System.out.println("Tweets: "+tweetCount);
		System.out.println("Retweeted count: "+retweets);
		System.out.println("Followers: "+followers+"\n");
	}
}