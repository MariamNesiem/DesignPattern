package Decorator;

public class RanchSauce extends SandwichDecorator {
	
	public RanchSauce (Sandwich sandwich) {
		super(sandwich);
	}
	
	@Override
	public String getContents()
	{
		return super.getContents() + " + Ranch Sause";
	}
	
	@Override
	public double getPrice()
	{
		return super.getPrice() + 5;
	}
}
