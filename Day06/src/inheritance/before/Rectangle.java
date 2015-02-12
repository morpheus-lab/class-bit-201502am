package inheritance.before;

public class Rectangle {
	
	// 멤버 변수
	private double width;	// 너비
	private double height;	// 높이
	private double area;	// 넓이
	private double circum;	// 둘레길이
	
	// 생성자
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// 멤버 메소드
	public void makeArea() {	// 넓이 계산
		area = width * height;
	}
	
	public void makeCircum() {	// 둘레 길이 계산
		circum = (width + height) * 2;
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
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
}
