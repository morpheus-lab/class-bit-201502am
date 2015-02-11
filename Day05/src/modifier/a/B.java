package modifier.a;

public class B {
	
	A a;
	
	void testA() {
		a = new A();
		
		// a 객체의 멤버 변수에 접근
//		System.out.println(a.priI);	// private	// 에러
		System.out.println(a.i);	// (package)
		System.out.println(a.proI);	// protected
		System.out.println(a.pubI);	// public
		
		// a 객체의 멤버 메소드에 접근(호출)
//		a.priM();	// private	// 에러
		a.m();		// (package)
		a.proM();	// protected
		a.pubM();	// public
	}
	// B는 A와 같은 패키지에 속하는 클래스
	// => private 접근 제어자가 붙어 있는 것을 제외한 모든 필드/메소드에 접근 가능
	
}
