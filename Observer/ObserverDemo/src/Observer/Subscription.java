package Observer;

public interface Subscription {
	 void subscribe(Observer observer);
	 void unsubscribe(Observer observer); 
	 void notifyAllSubscribers();
}
