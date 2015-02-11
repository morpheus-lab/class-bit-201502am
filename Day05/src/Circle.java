
public class Circle {
	
	double radius = 0;
	double area;
	
	ShapeUtil sUtil = new ShapeUtil();
	
	public Circle setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
			sUtil.calcArea(this);	// 내 면적 계산을 sUtil 객체에 위임
		}
		return this;
	}
	
//	double getArea() {
//		return Math.PI * radius * radius;
//	}
	
	Circle display() {
		System.out.println("이 원의 지름은 " + radius + "이고, "
				+ "넓이는 " + area);
		return this;
	}
	
}
