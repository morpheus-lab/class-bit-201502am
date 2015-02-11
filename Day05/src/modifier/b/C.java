package modifier.b;

import modifier.a.A;

public class C {
	
	A a;
	
	void testA() {
		a = new A();
		
		// a 객체의 멤버 변수에 접근
//		System.out.println(a.priI);	// private		// 에러
//		System.out.println(a.i);	// (package)	// 에러
//		System.out.println(a.proI);	// protected	// 에러
		System.out.println(a.pubI);	// public
		
		// a 객체의 멤버 메소드에 접근(호출)
//		a.priM();	// private		// 에러
//		a.m();		// (package)	// 에러
//		a.proM();	// protected	// 에러
		a.pubM();	// public
	}
	// C는 A와 다른 패키지에 속하는 클래스, A를 상속하지도 않음
	// => 오직 public에만 접근 가능
	
}
