package inheritance.after;

abstract public class Shape {
	
	// 멤버 변수
	protected double area;	// 넓이
	protected double circum;	// 둘레길이
	
	// 생성자
	public Shape() {
		System.out.println("Shape 생성자입니다~~");
	}
	
	public Shape(double area) {
		System.out.println("Shape 생성자(2)입니다~~");
		this.area = area;
	}
	
	// 멤버 메소드
	abstract public void makeArea();	// 넓이 계산
	
	abstract public void makeCircum();	// 둘레 길이 계산
	
	
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
	
}
