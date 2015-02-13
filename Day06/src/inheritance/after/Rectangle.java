package inheritance.after;

public class Rectangle extends Shape {
	
	// 멤버 변수
	private double width;	// 너비
	private double height;	// 높이
	
	// 생성자
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// 멤버 메소드
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void makeAR() {	// 사각형의 넓이를 계산
		area = width * height;
	}
	
	@Override
	public void makeArea() {	// 넓이 계산 기능을 재정의
		area = width * height;
	}

	@Override
	public void makeCircum() {
		circum = (width + height) * 2;
	}
	
}















