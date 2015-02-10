
public class Circle {
	
	private double radius = 0;
	
	public void setRadius(double r) {
		if (radius > 0) {
			radius = r;
		}
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	void display() {
		System.out.println("�� ���� ������ " + radius + "�̰�, "
				+ "���̴� " + getArea());
	}
	
}
