package Observer;

import java.util.ArrayList;
import java.util.List;

public class Store implements Subscription{
	
	private List<String> products=new ArrayList<String>();
	private String availabilty;
	private List<Observer> customersList=new ArrayList<Observer>();
	
	public Store() {
	}
	
	public void addProductInStore(String product) {
		products.add(product);
	}

	@Override
	public void subscribe(Observer observer) {
		customersList.add(observer);
		
	}

	@Override
	public void unsubscribe(Observer observer) {
		customersList.remove(observer);
	}

	@Override
	public void notifyAllSubscribers() {
		for(Observer observer:customersList) {
			observer.update(availabilty);
		}
	}
	
	public void checkAvalibality(String product) {
		availabilty = product + (products.contains(product)?" This product is Available" : " This Product is still Not Available");
		notifyAllSubscribers();		
	}
		
}
