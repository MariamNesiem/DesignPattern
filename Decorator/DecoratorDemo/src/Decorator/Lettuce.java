package Decorator;

public class Lettuce extends SandwichDecorator{

	public Lettuce(Sandwich sandwich) {
		super(sandwich);
	}
	
	@Override
	public String getContents()
	{
		return super.getContents() + " + Lettuce";
	}
	
	@Override
	public double getPrice()
	{
		return super.getPrice() + 5;
	}

}
