package inheritance;

public class B extends A {
	
	int f = 2;
	int f2;
	
	void fFromA() {
		System.out.println("A Ŭ������ ���� �������� f�� " + super.f);
	}
	
	void m() {
		System.out.println("B Ŭ������ m()�� ȣ��ƽ��ϴ�~");
	}
	
	void m2() {
		System.out.println("B Ŭ������ m2()�� ȣ��ƽ��ϴ�~");
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println("a.f = " + a.f);
		a.m();
//		a.f2++;
//		a.m2();
		
		B b = new B();
		System.out.println("b.f = " + b.f);	// f��� ������ A���� �ְ�, B���� �ִµ�.. ������ ��?
		b.fFromA();
		b.f2++;
		b.m();
		b.m2();
		
	}
	
}
