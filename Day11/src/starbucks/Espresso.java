package starbucks;

public class Espresso extends Beverage {
	
	public Espresso() {
		description = "���� ǳ���� ����������";
	}
	
	@Override
	public double cost() {
		return 1.99;	// ������������ ����: $1.99
	}
	
}
