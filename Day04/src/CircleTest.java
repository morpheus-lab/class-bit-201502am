
public class CircleTest {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		Circle c2 = new Circle();
		
		c1.setRadius(2);
		c2.setRadius(3);
		
		c1.display();
		c2.display();
		
		double sumArea = c1.getArea()
				+ c2.getArea();
		
		System.out.println("두 원 넓이의 합은 "
				+ sumArea);
		
	}
	
}
