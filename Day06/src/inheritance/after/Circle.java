package inheritance.after;

public class Circle extends Shape {

	// 멤버 변수
	private double radius;	// 반지름
	
	// 생성자
	public Circle() {
//		super();	// 상위 클래스의 기본 생성자 호출 -> 기본값
		System.out.println("Circle 생성자에요~");
	}
	
	public Circle(double radius) {
//		super();	// 상위 클래스의 기본 생성자 호출 -> 기본값
		super(3.0);	// 상위 클래스의 double 인자를 받는 생성자 호출
		
		System.out.println("Circle 생성자(2)에요~");
		this.radius = radius;
	}
	
	// 멤버 메소드
	public double getRadius() {
		return radius;
	}
	
//	public void makeAC() {	// 원의 넓이를 계산
//		area = Math.PI * Math.pow(radius, 2);
//	}
	
	@Override
	public void makeArea() {	// 넓이 계산 기능을 implement(구현)
		area = Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void makeCircum() {	// 둘레 계산 기능을 implement(구현)
		circum = 2 * Math.PI * radius;
	}
	
}








