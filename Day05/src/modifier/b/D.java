package modifier.b;

import modifier.a.A;

public class D extends A {	// A 클래스의 자식
	
	// ==> A가 가진 멤버 변수 및 메소드를 물려받는다
	// protected와 public만 물려받는다
	
	void testA() {
		// a 객체의 멤버 변수에 접근
//		System.out.println(priI);	// private		// 에러
//		System.out.println(i);		// (package)	// 에러
		System.out.println(proI);	// protected
		System.out.println(pubI);	// public
		
		// a 객체의 멤버 메소드에 접근(호출)
//		priM();	// private		// 에러
//		m();	// (package)	// 에러
		proM();	// protected
		pubM();	// public
	}
	// 
	
}
