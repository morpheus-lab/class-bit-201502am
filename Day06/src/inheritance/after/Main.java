package inheritance.after;

public class Main {
	
	public static void main(String[] args) {
		
		Circle c = new Circle(3);	// ������=3�� �� ��ü ����
		
		System.out.println("������: " + c.getRadius());
		
		c.display();	// ��ü ���� �� ���� ���
		
		c.makeArea();	// ���� ���
		
		c.display();	// ���� ��� �� ���� ���
		
		c.makeCircum();	// �ѷ� ���� ���
		
		c.display();	// �ѷ� ���� ��� �� ���� ���
		
		System.out.println("--------------------");
		
		Rectangle r = new Rectangle(3, 8);	// �ʺ� 3, ���� 8�� ���簢�� ��ü ����
		
		System.out.println("�ʺ�: " + r.getWidth());
		System.out.println("����: " + r.getHeight());
		
		r.display();
		
		r.makeArea();
		
		r.display();
		
		r.makeCircum();
		
		r.display();
		
		
		
	}
	
}
