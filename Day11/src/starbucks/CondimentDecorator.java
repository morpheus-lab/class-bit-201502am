package starbucks;

public abstract class CondimentDecorator extends Beverage {
	
	public abstract String getDescription();	// Beverage getDescription을 재정의
	
	// 의도: CondimentDecorator의 하위 클래스에서 반드시 getDescription()을 재정의하도록 강제
	
}
