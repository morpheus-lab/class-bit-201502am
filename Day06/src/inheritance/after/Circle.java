package inheritance.after;

public class Circle extends Shape {

	// 멤버 변수
	private double radius;	// 반지름
	
	// 생성자
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// 멤버 메소드
	public double getRadius() {
		return radius;
	}
	
}
