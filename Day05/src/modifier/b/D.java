package modifier.b;

import modifier.a.A;

public class D extends A {	// A Ŭ������ �ڽ�
	
	// ==> A�� ���� ��� ���� �� �޼ҵ带 �����޴´�
	// protected�� public�� �����޴´�
	
	void testA() {
		// a ��ü�� ��� ������ ����
//		System.out.println(priI);	// private		// ����
//		System.out.println(i);		// (package)	// ����
		System.out.println(proI);	// protected
		System.out.println(pubI);	// public
		
		// a ��ü�� ��� �޼ҵ忡 ����(ȣ��)
//		priM();	// private		// ����
//		m();	// (package)	// ����
		proM();	// protected
		pubM();	// public
	}
	// 
	
}
