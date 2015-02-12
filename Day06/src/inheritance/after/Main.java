package inheritance.after;

public class Main {
	
	public static void main(String[] args) {
		
		Circle c = new Circle(3);	// 반지름=3인 원 객체 생성
		
		System.out.println("반지름: " + c.getRadius());
		
		c.display();	// 객체 생성 후 정보 출력
		
		c.makeArea();	// 넓이 계산
		
		c.display();	// 넓이 계산 후 정보 출력
		
		c.makeCircum();	// 둘레 길이 계산
		
		c.display();	// 둘레 길이 계산 후 정보 출력
		
		System.out.println("--------------------");
		
		Rectangle r = new Rectangle(3, 8);	// 너비 3, 높이 8인 직사각형 객체 생성
		
		System.out.println("너비: " + r.getWidth());
		System.out.println("높이: " + r.getHeight());
		
		r.display();
		
		r.makeArea();
		
		r.display();
		
		r.makeCircum();
		
		r.display();
		
		
		
	}
	
}
