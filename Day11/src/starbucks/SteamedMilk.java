package starbucks;

public class SteamedMilk extends CondimentDecorator {

	Beverage base;
	
	public SteamedMilk(Beverage base) {
		this.base = base;
		this.description = "부드러운 스팀밀크";
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
