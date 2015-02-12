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
	
}
