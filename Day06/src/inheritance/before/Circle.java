package inheritance.before;

public class Circle {

	// ��� ����
	private double radius;	// ������
	private double area;	// ����
	private double circum;	// �ѷ�����
	
	// ������
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// ��� �޼ҵ�
	public void makeArea() {	// ���� ���
		area = Math.PI * Math.pow(radius, 2);
	}
	
	public void makeCircum() {	// �ѷ� ���� ���
		circum = 2 * Math.PI * radius;
	}
	
	public void display() {		// ȭ�鿡 ���� ���
		System.out.println("����: " + area
						+ ", �ѷ�: " + circum);
	}
	
	public double getArea() {
		return area;
	}
	
	public double getCircum() {
		return circum;
	}
	
	public double getRadius() {
		return radius;
	}
	
}
