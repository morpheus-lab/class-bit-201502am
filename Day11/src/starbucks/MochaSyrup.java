package starbucks;

public class MochaSyrup extends CondimentDecorator {

	Beverage base;
	
	public MochaSyrup(Beverage base) {
		this.base = base;
		this.description = "달콤한 모카시럽";
	}
	
	@Override
	public String getDescription() {
		return base.getDescription() + " + " + this.description;
	}

	@Override
	public double cost() {
		return base.cost() + 0.20;	// 베이스 음료 가격 + 모카 시럽 가격($0.20)
	}
	
	
	
}
