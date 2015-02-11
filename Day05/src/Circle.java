
public class Circle {
	
	double radius = 0;
	double area;
	
	ShapeUtil sUtil = new ShapeUtil();
	
	public Circle setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
			sUtil.calcArea(this);	// �� ���� ����� sUtil ��ü�� ����
		}
		return this;
	}
	
//	double getArea() {
//		return Math.PI * radius * radius;
//	}
	
	Circle display() {
		System.out.println("�� ���� ������ " + radius + "�̰�, "
				+ "���̴� " + area);
		return this;
	}
	
}
