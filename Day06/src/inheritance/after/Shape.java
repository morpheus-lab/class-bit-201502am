package inheritance.after;

public class Shape {
	
	// ��� ����
	protected double area;	// ����
	protected double circum;	// �ѷ�����
	
	// ������
	public Shape() {
		
	}
	
	// ��� �޼ҵ�
	public void makeArea() {	// ���� ���
		
	}
	
	public void makeCircum() {	// �ѷ� ���� ���
		
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
	
}
