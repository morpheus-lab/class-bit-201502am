
public class StaticMethodTest {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		a1.sm();
		a1.m();
		
		A.sm();
		// A.m();	// m()은 static이 아니라서 클래스 이름으로 접근 불가
		
		A a2 = new A();
		a2.m();
		
	}
	
}
