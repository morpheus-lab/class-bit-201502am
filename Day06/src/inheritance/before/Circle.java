package inheritance.before;

public class Circle {

	// 멤버 변수
	private double radius;	// 반지름
	private double area;	// 넓이
	private double circum;	// 둘레길이
	
	// 생성자
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// 멤버 메소드
	public void makeArea() {	// 넓이 계산
		area = Math.PI * Math.pow(radius, 2);
	}
	
	public void makeCircum() {	// 둘레 길이 계산
		circum = 2 * Math.PI * radius;
	}
	
	public void display() {		// 화면에 정보 출력
		System.out.println("넓이: " + area
						+ ", 둘레: " + circum);
	}
	
	public double getArea() {
		return area;
	}
	
	public double getCircum() {
		return circum;
	}
	
	public double getRadius() {
		return radius;
	}
	
}
