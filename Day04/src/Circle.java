
public class Circle {
	
	private double radius = 0;
	
	public void setRadius(double r) {
		if (radius > 0) {
			radius = r;
		}
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	void display() {
		System.out.println("이 원의 지름은 " + radius + "이고, "
				+ "넓이는 " + getArea());
	}
	
}
