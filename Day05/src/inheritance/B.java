package inheritance;

public class B extends A {
	
	int f = 2;
	int f2;
	
	void fFromA() {
		System.out.println("A 클래스로 부터 물려받은 f는 " + super.f);
	}
	
	void m() {
		System.out.println("B 클래스의 m()이 호출됐습니다~");
	}
	
	void m2() {
		System.out.println("B 클래스의 m2()가 호출됐습니다~");
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println("a.f = " + a.f);
		a.m();
//		a.f2++;
//		a.m2();
		
		B b = new B();
		System.out.println("b.f = " + b.f);	// f라는 변수가 A에도 있고, B에도 있는데.. 누구냐 넌?
		b.fFromA();
		b.f2++;
		b.m();
		b.m2();
		
	}
	
}
