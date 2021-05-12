package Decorator;

public class Cheese extends SandwichDecorator{

	public Cheese(Sandwich sandwich) {
		super(sandwich);
	}
	
	@Override
	public String getContents()
	{
		return super.getContents() + " + Cheese";
	}
	
	@Override
	public double getPrice()
	{
		return super.getPrice() + 10;
	}
}
