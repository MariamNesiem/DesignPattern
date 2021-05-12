package Decorator;

public class BasicSandwich implements Sandwich{

	@Override
	public String getContents() {
		// TODO Auto-generated method stub
		return "Regular Sandwich: Bread, Burger";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 10;
	}

}
