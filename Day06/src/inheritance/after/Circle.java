package inheritance.after;

public class Circle extends Shape {

	// ��� ����
	private double radius;	// ������
	
	// ������
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// ��� �޼ҵ�
	public double getRadius() {
		return radius;
	}
	
}
