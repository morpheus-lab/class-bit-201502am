package inheritance.after;

public class Rectangle extends Shape {
	
	// ��� ����
	private double width;	// �ʺ�
	private double height;	// ����
	
	// ������
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// ��� �޼ҵ�
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void makeAR() {	// �簢���� ���̸� ���
		area = width * height;
	}
	
	@Override
	public void makeArea() {	// ���� ��� ����� ������
		area = width * height;
	}

	@Override
	public void makeCircum() {
		circum = (width + height) * 2;
	}
	
}















