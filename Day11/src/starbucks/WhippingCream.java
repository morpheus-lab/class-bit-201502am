package starbucks;

public class WhippingCream extends CondimentDecorator {

	Beverage base;
	
	public WhippingCream(Beverage base) {
		this.base = base;
		this.description = "부드럽고 풍부한 휘핑크림";
	}
	
	@Override
	public String getDescription() {
		return base.getDescription() + " + " + this.description;
	}

	@Override
	public double cost() {
		return base.cost() + 0.10;
	}
	
	
	
}
