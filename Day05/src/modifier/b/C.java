package modifier.b;

import modifier.a.A;

public class C {
	
	A a;
	
	void testA() {
		a = new A();
		
		// a ��ü�� ��� ������ ����
//		System.out.println(a.priI);	// private		// ����
//		System.out.println(a.i);	// (package)	// ����
//		System.out.println(a.proI);	// protected	// ����
		System.out.println(a.pubI);	// public
		
		// a ��ü�� ��� �޼ҵ忡 ����(ȣ��)
//		a.priM();	// private		// ����
//		a.m();		// (package)	// ����
//		a.proM();	// protected	// ����
		a.pubM();	// public
	}
	// C�� A�� �ٸ� ��Ű���� ���ϴ� Ŭ����, A�� ��������� ����
	// => ���� public���� ���� ����
	
}
