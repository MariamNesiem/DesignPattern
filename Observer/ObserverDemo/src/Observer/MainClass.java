package Observer;

public class MainClass {

	public static void main(String[] args) {
		Store store=new Store();
		store.addProductInStore("IPhone");
		
		Customer customer1=new Customer("Mariam");
		Customer customer2=new Customer("Bassant");
		Customer customer3=new Customer("Ibrahim");
		
		store.subscribe(customer1);
		store.subscribe(customer2);
		store.subscribe(customer3);
		store.unsubscribe(customer3);

		store.checkAvalibality("IPhone");

	}

}
