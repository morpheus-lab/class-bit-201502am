package starbucks;

public abstract class Beverage {
	
	String description = "내용없음";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();	// 비용계산
	
}
