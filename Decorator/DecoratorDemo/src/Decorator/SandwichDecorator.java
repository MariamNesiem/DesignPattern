package Decorator;

public class SandwichDecorator implements Sandwich{
private Sandwich sandwich;

public SandwichDecorator(Sandwich sandwich) {
	this.sandwich=sandwich;
}

@Override
public String getContents() {
	// TODO Auto-generated method stub
	return this.sandwich.getContents();
}

@Override
public double getPrice() {
	// TODO Auto-generated method stub
	return this.sandwich.getPrice();
}

}
