package inheritance.after;

abstract public class Shape {
	
	// ��� ����
	protected double area;	// ����
	protected double circum;	// �ѷ�����
	
	// ������
	public Shape() {
		System.out.println("Shape �������Դϴ�~~");
	}
	
	public Shape(double area) {
		System.out.println("Shape ������(2)�Դϴ�~~");
		this.area = area;
	}
	
	// ��� �޼ҵ�
	abstract public void makeArea();	// ���� ���
	
	abstract public void makeCircum();	// �ѷ� ���� ���
	
	
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
	
}
