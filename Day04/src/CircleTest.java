
public class CircleTest {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		Circle c2 = c1;
		
		c1 = null;
		
		c2 = null;
		
		System.gc(); // ������ �÷����� ������ �ּ���
		
	}
	
}
