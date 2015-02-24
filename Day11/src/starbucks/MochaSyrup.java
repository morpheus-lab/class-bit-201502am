package starbucks;

public class MochaSyrup extends CondimentDecorator {

	Beverage base;
	
	public MochaSyrup(Beverage base) {
		this.base = base;
		this.description = "������ ��ī�÷�";
	}
	
	@Override
	public String getDescription() {
		return base.getDescription() + " + " + this.description;
	}

	@Override
	public double cost() {
		return base.cost() + 0.20;	// ���̽� ���� ���� + ��ī �÷� ����($0.20)
	}
	
	
	
}
