package inheritance.after;

public class Circle extends Shape {

	// ��� ����
	private double radius;	// ������
	
	// ������
	public Circle() {
//		super();	// ���� Ŭ������ �⺻ ������ ȣ�� -> �⺻��
		System.out.println("Circle �����ڿ���~");
	}
	
	public Circle(double radius) {
//		super();	// ���� Ŭ������ �⺻ ������ ȣ�� -> �⺻��
		super(3.0);	// ���� Ŭ������ double ���ڸ� �޴� ������ ȣ��
		
		System.out.println("Circle ������(2)����~");
		this.radius = radius;
	}
	
	// ��� �޼ҵ�
	public double getRadius() {
		return radius;
	}
	
//	public void makeAC() {	// ���� ���̸� ���
//		area = Math.PI * Math.pow(radius, 2);
//	}
	
	@Override
	public void makeArea() {	// ���� ��� ����� implement(����)
		area = Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void makeCircum() {	// �ѷ� ��� ����� implement(����)
		circum = 2 * Math.PI * radius;
	}
	
}








