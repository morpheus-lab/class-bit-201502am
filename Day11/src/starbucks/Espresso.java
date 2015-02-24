package starbucks;

public class Espresso extends Beverage {
	
	public Espresso() {
		description = "향이 풍부한 에스프레소";
	}
	
	@Override
	public double cost() {
		return 1.99;	// 에스프레소의 가격: $1.99
	}
	
}
